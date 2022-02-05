# Lab 02

## Due: The start of your week 3 lab

## Aim

* Understand the OO principles abstraction, encapsulation and inheritance
* Become familiar with the Java API

## Project Partners

Under the guidance of your tutors, arrange yourselves into pairs for the project. Your tutors can help you find a partner if you don't already have one.

You will need to register a group on WebCMS with both you and your partner in it by **Friday** of this week. Even if you choose to work alone, you still need to register a group. To do this, **one** member needs to register it on the course website:

1. Click on **Groups** on the left.
2. Click on **Create**
3. Give the group a name of the form *TUTE*-*name*, where *TUTE* is the code for the lab as on the timetable on the course website and *name* is a name for your team (e.g. T13A-cool_kids). The name portion can be whatever you want (within reason) but must contain only alphanumeric characters and underscores (no whitespace or special characters).
4. Ensure that the group type is **Project**.
5. Click **Create** to create the group.

The other member of your partnership can then **join** this group:

1. Click on **Groups** on the left.
2. Find your group in the list.
3. Click **Join**

## Setup

An individual repository for this lab has been created for you here (replace z5555555 with your own zID):

https://gitlab.cse.unsw.edu.au/z5555555/20T3-cs2511-lab02

## Exercise

Modify the class StaffMember (inside package `staff`) so that it satisfies the following requirements:

* Attributes to store the staff member’s name, salary, hire date, and end date.
* Appropriate constructors, getters, setters, and other methods you think are necessary.
* Overridden `toString()` and `equals(..)` methods. Use what you learnt from the tutorial, but make sure you understand what these methods are doing.
* Javadoc for all non-overriding methods and constructors.

Create a sub-class of `StaffMember` called `Lecturer` in the same package with the following requirements:

* An attribute to store the school (e.g. CSE) that the lecturer belongs to
* An attribute that stores the academic status of the lecturer (e.g A for an Associate Lecturer, B  for a Lecturer, and C for a Senior Lecturer)
* Appropriate getters and setters.
* An overriding `toString()` method that includes the school name and academic level.
* An overriding `equals(...)` method.
* Javadoc for all non-overriding methods and constructors.

Create a class `StaffTest` in the package `staff.test` to test the above classes. It should contain:

* A method `printStaffDetails(...)` that takes a `StaffMember` as a parameter and invokes the `toString()` method on it to print the details of the staff.
* A `main(...)` method that:

  * Creates a `StaffMember` with a name and salary of your choosing.
  * Creates an instance of `Lecturer` with a name, salary, school and academic status of your choosing.
  * Calls `printStaffDetails(...)` twice with each of the above as arguments.
  * Tests the `equals(..)` method of the two classes. Use [the documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object)) for `Object.equals(...)` as a guide for what you should test.

## Submission

Make sure that all your work has been pushed to GitLab then submit it with:

```bash
$ 2511 submit lab02
```

## Prologue

With any leftover time in your lab, look at the specification for assignment 1 and try to come to a concrete understanding of the requirements. You may even try to write down an initial set of CRC cards.
