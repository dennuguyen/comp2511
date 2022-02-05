# Tutorial 5

## Interfaces, abstract classes and inheritance

Compare interfaces, abstract classes and concrete classes.

* Which of them can be constructed?
* Which can have abstract methods?
* Which can have concrete methods?
* Which can have fields?
* How do they relate to each other in terms of inheritance and realisation?

Consider a game where different types of characters move around on a grid fighting each other. When one character moves into the square occupied by another they attack that character and inflict damage based on random chance (e.g. a dice roll).

* A king can move one square in any direction (including diagonally), and always causes 8 points of damage when attacking.
* A knight can move like a knight in chess (in an L shape), and has a 1 in 2 chance of inflicting 10 points of damage when attacking.
* A queen can move to any square in the same column, row or diagonal as she is currently on, and has a 1 in 3 chance of inflicting 12 points of damage or a 2 out of 3 chance of inflicting 6 points of damage.
* A troll can only move up, down, left or right, and has a 1 in 6 chance of inflicting 20 points of damage.

The classes in the packages `unsw.characters.inheritance` and `unsw.characters.strategy` show two different approaches to representing the characters in such a game.

* What are the key differences between the two?
* How does this example differ from the movie rental example from last week?
* What are the strengths and weaknesses of each approach?
* Suppose you wanted to create a new elf character that moves like a king, but attacks like a queen. How would you implement such a character with both approaches?
* Thinking more generally, is one of them always preferable to the other?
