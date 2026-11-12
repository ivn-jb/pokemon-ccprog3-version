# Pokemon CCPROG3 Version

An educational Java desktop game where players collect, battle, and evolve
creatures across different areas.

> **Project history:** This project was originally made in **2023** as a
> CCPROG3 course requirement. It has been **AI-refined now** to improve its
> presentation and documentation while preserving the original project's
> identity and gameplay concept.

## About the Project

This was my first Java object-oriented programming project. I enjoyed making
it with **Matthew Ong**, from the backend logic to the user interface design.
The project combines a Java Swing interface with object-oriented game models
for players, creatures, inventory, areas, and battles.

## Features

- Start screen and guided player introduction
- Player naming and starter creature selection
- Three creature types: Fire, Grass, and Water
- Type advantages during battles
- Random creature encounters
- Turn-based attacks with damage affected by evolution level and type advantage
- Creature catching with chance-based outcomes
- Inventory management with active-creature switching
- Creature evolution by combining two creatures from the same family and
  evolution level
- Multiple areas and map movement
- Custom visual assets for screens, creatures, buttons, and maps

## Gameplay Overview

1. Start the game and enter a player name.
2. Choose one of the available starter creatures.
3. Visit areas and move around the map to encounter creatures.
4. Battle encountered creatures using attacks, creature switching, or catching.
5. Add successfully caught creatures to the inventory.
6. Combine two compatible creatures to evolve them.
7. Build a stronger collection by managing active creatures and exploring.

## Object-Oriented Design

The project is organized around separate classes with distinct
responsibilities:

- `Creature` - stores creature identity, type, family, evolution level, and
  active status.
- `CreatureGenerator` - defines the creature catalog and generates encounters.
- `Player` - stores player information and map state.
- `Inventory` - manages the player's creature collection and evolution.
- `BattlePhase` - handles battle state, type advantages, attacks, and catching.
- `Area` - stores the player's map position.
- `Gameview` - builds the Java Swing user interface.
- `Gamecontroller` - connects the UI to the game models and handles actions.
- `Driver` - creates the game objects and starts the application.

The code demonstrates encapsulation, object composition, event-driven
programming, and separation between model, view, and controller
responsibilities.

## Requirements

- Java Development Kit (JDK) 8 or newer
- A desktop environment that supports Java Swing

## Running the Game

Open a terminal in the project root, where `Driver.java` and the `resources`
folder are located.

### Windows PowerShell

```powershell
javac *.java
java Driver
```

The resource paths are relative to the project root, so run the application
from this directory.

## Project Structure

```text
.
├── *.java                 # Java source files
├── resources/             # Game backgrounds, creature art, and UI assets
├── doc/                   # Generated JavaDoc documentation
├── MCO2.png               # Project image
└── Driver.java            # Application entry point
```

Compiled `.class` files and IDE-specific files are intentionally excluded from
version control through `.gitignore`.

## Credits

- **Jorem Boado** - Development and UI design
- **Matthew Ong** - Development and UI design

Created as a CCPROG3 academic project in 2023 and AI-refined in 2026.

## Disclaimer

This is an educational fan project made for coursework. It is not affiliated
with or endorsed by Nintendo, Game Freak, or The Pokemon Company. Any
third-party names or references belong to their respective owners.
