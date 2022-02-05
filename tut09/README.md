# Tutorial 9

## Decorator Pattern

Recall the simple game from a previous tutorial. In this game different types of characters move around on a grid fighting each other. When one character moves into the square occupied by another they attack that character and inflict damage based on random chance (e.g. a dice roll).

* A king can move one square in any direction (including diagonally), and always causes 8 points of damage when attacking.
* A knight can move like a knight in chess (in an L shape), and has a 1 in 2 chance of inflicting 10 points of damage when attacking.
* A queen can move to any square in the same column, row or diagonal as she is currently on, and has a 1 in 3 chance of inflicting 12 points of damage or a 2 out of 3 chance of inflicting 6 points of damage.
* A troll can only move up, down, left or right, and has a 1 in 6 chance of inflicting 20 points of damage.

A simple implementation of the characters using inheritance is included in the code for this tute.

Suppose a requirements change was introduce that necessitated support for different sorts of armour.

* A helmet reduces the amount of damage inflicted upon a character by 1 point.
* Chain mail reduces the amount of damage by a half (rounded down).
* A chest plate caps the amount of damage to 7, but also slows the character down. If the character is otherwise capable of moving more than one square at a time then this armour restricts each move to distances of 3 squares or less (by manhattan distance).

Use the decorator pattern to realise these new requirements. For simplicity, assume that, as this game takes place in a virtual world, there are no restrictions on the number of pieces of armour a character can wear and that the "order" in which armour is worn affects how it works. You will need to make a small change to the existing code to best use the decorator pattern.

## User-centric design

Consider [Nielsen's usability heuristics](https://www.nngroup.com/articles/ten-usability-heuristics/). Going through the list, which of them might apply to the project and how? Try to think of concrete examples how they might be violated.
