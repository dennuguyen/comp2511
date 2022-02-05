# Tutorial 4

## Design principles

In the `unsw.training` package there is some skeleton code for a training system. In an organisation, every employee must attend a whole day training seminar run by a qualified trainer. Each trainer is running multiple seminars with no more than 10 attendees per seminar. In the `TrainingSystem` class there is a method to book a seminar for an employee given the dates on which they are available. This method violates the principle of least knowledge (Law of Demeter).

* How and why does it violate this principle?
* In violating this principle, what other properties of this design are not desirable?
* Refactor the code so that the principle is no longer violated. How has this affected other properties of the design?
* More generally, are getters essentially a means of violating the principle of least knowledge? Does this make using getters bad design?

Look at the `OnlineSeminar` class.

* What design principle does it violate? Give an informal justification why.

## Refactoring

Consider the movie rental example from lectures (in the `unsw.movies` package).

* What issues are present in the `statement()` method of the `Customer` class?
* Refactor the code to resolve these issues. Try to do the refactoring by small steps, each one preserving the behaviour of the example.
