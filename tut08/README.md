# Tutorial 8

## Patterns

Given the following problems, which patterns covered in this course might be appropriate to solve them.

* Sorting collections of records in different orders.
* Modelling a file system.
* Updating a UI component when the state of a program changes.
* Parsing and evaluating arithmetic expressions.
* Adjusting the brightness of a screen based on a light sensor.

## Programming/Design by contract

Consider the following set of requirements:

* A BankAccount class for maintaining a customer's bank balance.
  * Each bank account should have a current balance and methods implementing deposits and withdrawals.
  * Money can only be withdrawn from an account if there are sufficient funds.

* A subclass of BankAccount called LoggedBankAccount.
  * Every deposit and withdrawal must make a log of the action.

Implement both of these classes in Java and define suitable pre and post-conditions for the methods.

* Is the code consistent with the pre- and post-conditions? Explain why.
* Provide a rigorous argument that *balance >= 0* is a class invariant for both classes.
* Are your class definitions consistent with the Liskov Substitution Principle?

Using the above as an example, but also more generally, how does the Liskov Substitution Principle compare to the other design principles covered in this course?
