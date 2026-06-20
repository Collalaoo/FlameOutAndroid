# Flame Out — Mindustry v8 Mod

A massive **Flame Out** boss-rush/micro-PvE mod for **Mindustry v8 (build 158.1)**, ported from the original by **eyeofdarkness**.

Fight brutal multi-phase bosses, dodge screen-filling bullet hells, and tear through waves of corrupted units.

---

## 🧨 Features

- **10+ unique bosses** with multiple attack phases
- **Custom bullet patterns** — lasers, ricochets, sprays, magic orbs
- **Empathy units** — fight copies of yourself that adapt to your tactics
- **Despondency** — the final boss with devastating weapons
- **Custom shaders, particles, and sound effects**
- **Solo / micro-PvE experience** — not designed for multiplayer

## 🖥️ Building

### Requirements
- JDK **17** or later

### Desktop
```bash
./gradlew jar
```
Jar → `build/libs/flameoutDesktop.jar`

### Android + Desktop (full deploy)
```bash
export ANDROID_HOME=/path/to/android/sdk
./gradlew deploy
```
Creates `build/libs/flameout.jar` (works on both platforms).

## 🎮 How to play

Place the `.jar` in Mindustry's `mods/` folder and enable it in the mod menu.
Start a new survival game — the bosses begin appearing from wave 1.

## 📜 License / Ліцензія

Apache 2.0 — see [LICENSE](LICENSE).

---

# Flame Out — Мод для Mindustry v8

Огромный **Flame Out** — мод в жанре boss-rush / micro-PvE для **Mindustry v8 (build 158.1)**, портированный с оригинальной версии от **eyeofdarkness**.

Сражайтесь с брутальными многофазными боссами, уворачивайтесь от заполняющих весь экран данмаку-паттернов и прорывайтесь сквозь волны искажённых юнитов.

## 🧨 Особенности

- **10+ уникальных боссов** с несколькими фазами атак
- **Кастомные пулевые паттерны** — лазеры, рикошеты, спреи, магические сферы
- **Эмпатические юниты** — сражайтесь с копиями себя, адаптирующимися к вашей тактике
- **Despondency** — финальный босс с разрушительным вооружением
- **Собственные шейдеры, частицы и звуки**
- **Одиночный / micro-PvE опыт** — не рассчитан на мультиплеер

## 🖥️ Сборка

### Требования
- JDK **17** или новее

### Desktop
```bash
./gradlew jar
```
Jar → `build/libs/flameoutDesktop.jar`

### Android + Desktop (полная сборка)
```bash
export ANDROID_HOME=/path/to/android/sdk
./gradlew deploy
```
Создаёт `build/libs/flameout.jar` (работает на обеих платформах).

## 🎮 Как играть

Поместите `.jar` в папку `mods/` Mindustry и включите его в меню модов.
Начните новую игру в режиме выживания — боссы начнут появляться с первой волны.

## 📜 Лицензия

Та же, что и у оригинала — см. [LICENSE](LICENSE).
