# Magical Arena

## Overview
This project simulates a magical arena where two players fight until one dies. Each player has health, strength, and attack attributes. The players attack and defend using dice rolls.


### Classes and Their Responsibilities:

### Player

The `Player` class represents a player in the arena. It includes:
- Attributes: health, strength, and attack.
- Methods to get these attributes, reduce health, and check if the player is alive.
- A nested `Builder` class to create `Player` objects.

### Die

The `Die` class simulates a six-sided die. It includes:
- A method to roll the die and return a random number between 1 and 6.

### Arena

The `Arena` class manages the fight between two players. It includes:
- Methods to start the fight, handle a fight round, and determine the winner.

### Main

The `Main` class contains the `main` method, which sets up the players and the arena, starts the fight, and prints the winner.

## How to Run
1. Compile the code:
   ```sh
   javac Main.java Player.java Die.java PlayerFactory.java Arena.java
   ```
2. Run the code:
   ```sh
   java Main
   ```
## Test
Unit tests are provided to ensure the correctness of the implementation. To run the tests, you can use any Java testing framework like JUnit.

## Design Considerations
<ul>
<li> The design follows SOLID principles and uses design patterns like Factory, Builder, and Facade.</li>
<li> The code is organized with clear class responsibilities.</li>
<li> Unit tests cover the main functionalities.</li>
