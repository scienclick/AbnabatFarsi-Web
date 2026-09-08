# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project overview

"Nabat Farsi" (نبات فارسی) is a Persian-alphabet learning game for kids, built on **libGDX** and compiled to a browser-playable app via **GWT** (Google Web Toolkit). There is no native/desktop/mobile launcher in this repo — only the `html` GWT module. Gameplay: kids drag letter/word "players" onto matching "obstacle" targets across a sequence of levels, each level teaching one Farsi letter or word.

## Build & run

This is a two-module Gradle project (`core` = platform-independent game logic, `html` = GWT web frontend + assets). Java 8 (`sourceCompatibility 1.8`).

```bash
./gradlew html:superDev      # GWT SuperDev mode — fast dev loop with incremental recompile (port 9876, app served on 8080)
./gradlew html:compileGwt    # full GWT-to-JS compile (slow, use before checking real prod output)
./gradlew html:war           # build the deployable WAR (html/build/libs/html-1.0.war)
./gradlew build              # build all modules
```

There are no unit tests in this repo currently.

### Docker

`Dockerfile` builds the WAR with a `gradle:7.6-jdk8` image, then unpacks it into an `nginx:1.25-alpine` image (`nginx.conf` handles SPA fallback and long-lived caching for `.cache.js`/atlas/image assets). Run locally via `docker-compose up` (serves on host port 8080).

### GWT build gotchas (do not "simplify" these away)

The GWT toolchain here is fragile — several non-obvious fixes hold the build together:

- **GWT plugin**: `de.richsource.gradle.plugins:gwt-gradle-plugin:0.6` (jcenter/bintray, both dead) was replaced with `org.docstr:gwt-gradle-plugin:1.1.31` (same `gwt` plugin id/DSL, published to the Gradle Plugin Portal — added as a `buildscript` repo). Do **not** upgrade to `org.docstr.gwt` 2.x — that's a from-scratch rewrite with a different, incompatible DSL.
- **`gwt-user` version conflict**: `gdx-backend-gwt`'s POM hard-pins `com.google.gwt:gwt-user:2.8.2`. The gwt plugin separately adds `org.gwtproject:gwt-user/gwt-dev:2.10.0` (different Maven coordinates, same classes) since `gwtVersion = "2.10.0"`. Both on the classpath at once corrupts GWT's compile. `html/build.gradle`'s `configurations.all { exclude group: "com.google.gwt", module: "gwt-user" }` prevents this — don't remove it.
- **`jsinterop-annotations` has no GWT source registered**: `com.google.jsinterop:jsinterop-annotations` ships `.class`-only binaries with no bundled `.gwt.xml` module, so nothing tells GWT to treat its package as source — gdx's generated reflection code (`com.badlogic.gwtref`) needs it. Fixed by (a) adding the `:sources` classifier as an `implementation` dependency and (b) a hand-written `html/src/jsinterop/Annotations.gwt.xml` module (`<source path="annotations"/>`) inherited from `GdxDefinition(.Superdev).gwt.xml`.
- **`<source path="."/>` is silently a no-op**: GWT's module schema rejects any source path starting with `./` (logs "Non-canonical source package" and drops it — the module ends up with **zero** registered source, not "root package"). Use `<source path=""/>` instead to register the module's own base package recursively. This bit both `Core.gwt.xml` and `GdxDefinition(.Superdev).gwt.xml`.
- **`gdx.assetpath`/`gdx.assetoutputpath`**: `gdx.assetpath` must point at `webapp` (the directory whose immediate children are `gameplay/`, `gamesounds/` — matching the runtime-relative paths in `AssetPaths.java`), not `.` (the whole `html/` project dir — combined with the default output path this creates a self-referential copy loop, `war/assets/war/assets/...`, that crashes the compile). `gdx.assetoutputpath` must be pinned to `build/gwt/out` (the gwt plugin's actual `-war` output dir for `compileGwt`/`html:war`) — the `PreloaderBundleGenerator`'s built-in default (`war/`) refers to a different, orphaned directory that never reaches the packaged `.war`. `GdxDefinitionSuperdev.gwt.xml` intentionally does *not* set `gdx.assetoutputpath` — its default `war/` correctly matches `gwtSuperDev`'s own `devWar` convention (`html/war`).
- **`index.html` at the WAR root**: neither the gwt plugin's war wiring nor the standard `war` plugin's default `webAppDir` (`src/main/webapp`, unused here — real static assets live in `html/webapp/`) puts `webapp/index.html` at the WAR root. `html/build.gradle`'s `war { from('webapp') { include 'index.html' } }` handles just that one file (game assets already reach the war correctly via the preloader/`gdx.assetpath` mechanism above — don't widen this to `from('webapp')` without excludes, or you'll double-ship unhashed copies of `gameplay/`/`gamesounds/`).
- **nginx's base image ships its own `index.html`**: `unzip` without `-o` silently skips files that already exist when run non-interactively, so the WAR's `index.html` never overwrote nginx's welcome page. The Dockerfile clears `/usr/share/nginx/html` before unzipping (`-o` is also set as a second safety net).
- `java.util.UUID` is not in GWT's JRE emulation — avoid it in `core` code (there's no other emulation-gap workaround needed currently, but keep this in mind if adding `java.util.*` usage to shared code).

If a fresh `docker compose build` ever regresses on GWT compile errors, re-derive from `com.google.gwt.dev.Compiler`'s own diagnostics (`gwt { logLevel = "TRACE" }` temporarily helps) rather than reverting these fixes blind — each one traces back to a specific root cause documented above.

## Architecture

### Module split
- `core/src/com/nabatfarsi/` — all game logic, platform-agnostic (libGDX `ApplicationListener`/`Game`/`Screen` classes). This is where nearly all code changes happen.
- `html/src/com/nabatfarsi/gwt/GwtLauncher.java` — the GWT entry point; just constructs `nabatfarsi` (the `Game` subclass) with a 1200x640 config.
- `html/webapp/` — static assets served to the browser: `gameplay/<levelname>/medium/*.png` + `.atlas` (TexturePacker atlases, one per level), `gamesounds/`, `index.html`.

### App/Screen flow
`nabatfarsi.java` (in `core`) is the libGDX `Game` entry point. It initializes `GameManager` (a singleton wrapping `Preferences` for persisted level/menu state) and pushes screens:
- `LoadingScreen` → loads the atlas/sound assets for a given level via `AssetManager`, then transitions to `GameScreen` or `MenuScreen`.
- `GameScreen` owns a `GameController` (game logic/state/input) + `GameRenderer` (draws the scene, `Screen/game/`). `GameController` reacts to level-complete/menu/next/previous-level flags read back by `GameScreen.render()`, which then swaps in a new `LoadingScreen` for the next level.
- `MenuScreen` — level-select menu.

### Level system
Each learnable letter/word is one level, implemented as a subclass of `LevelBase` (`level/instances/L*.java` for gameplay levels, `D*.java` for the corresponding demo/intro variant — e.g. `L1_ab.java` teaches "ا", `D1_ab.java` demonstrates it). A `LevelBase` subclass implements four factory methods (`GeneratePlayerArray`, `GenerateObstacleArray`, `GenerateEndScene`, `GenerateAnimatedActor`) that build the level's `Player[]` (draggable items) and `Obstacle[]` (drop targets) from its `AssetManager`-loaded `TextureAtlas`.

`LevelGenerator` is the static helper that takes a `LevelBase` instance and produces the `Player`→`Obstacle` pairing (`HashMap`) the controller uses to check matches, plus shared background/bird generation and player/obstacle positioning logic (hardcoded layout cases by player count, in world units).

`LetterFactory` / `WordFactory` build individual `Player`/`Obstacle` entities (texture regions, sizing, sounds) for reuse across level classes — prefer adding new letter/word helpers there rather than duplicating entity construction inline in a new `L*`/`D*` class.

Adding a new level means: add its atlas to `assets/AssetPaths.java` + `AssetDescriptors.java`, add texture region name constants to `assets/RegionNames.java`, create `level/instances/L<N>_<name>.java` (and a `D<N>_<name>.java` demo variant if the level has one), and wire it into whatever level-sequencing logic in `GameController` (currently many level classes are imported/referenced directly there) and `GameConfig.NUMBER_OF_LEVEL`.

### Entities
`entity/` defines the scene-graph actors: `CustomActor` (base, extends libGDX `Actor`) → `GameObjectBase` → `Player` / `Obstacle` / `Background`. `Player` represents a draggable item (a letter, word, or decorative bird); `Obstacle` is a drop target.

### Config
`config/GameConfig.java` centralizes tunable constants (world dimensions in world units vs. `WIDTH`/`HEIGHT` in pixels, sizes/speeds/durations for players, confetti, pens, chick loading animation, etc.) — check here first before hardcoding a magic number elsewhere. `GameAnimationConfig`, `GameColorsConfettis`, `DemoObsticlePositions`, `MenuObsticlePositions` hold more specialized per-feature constants.

### GameManager (persistence)
`common/GameManager.java` is a singleton wrapping libGDX `Preferences` (browser localStorage under GWT) for persisting current/previous level, current/previous menu, and purchase state across sessions. Note: this is a web build — `nabatfarsi.ISPURCHASED()` and `getGameEventListener()` are hardcoded to always return "purchased"/no-op, since there's no IAP in the web version.

## Working with assets

Level art is packed into libGDX `TextureAtlas` files (`.atlas` + one or more `.png` pages) under `html/webapp/gameplay/<level>/medium/`. Region names referenced in code must match `assets/RegionNames.java` constants exactly — check the `.atlas` file's region names when adding/renaming art. Sounds live under `html/webapp/gamesounds/` and are wired through `AssetPaths`/`AssetDescriptors` similarly to atlases.
