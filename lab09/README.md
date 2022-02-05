# Lab 09

## Due: Week 10, Sunday, 5:00 pm

**NOTE**: You have two weeks to do this lab

## Aim

* Implement a class given a contract.
* Gain experience with Java generics.

## Setup

An individual repository for this lab has been created for you here (replace z5555555 with your own zID):

https://gitlab.cse.unsw.edu.au/z5555555/20T3-cs2511-lab09

## Preamble

This lab will be entirely automarked. Some tests have been provided, but the tests used for automarking will be more exhaustive. Partial marks are available (see below). It's important that you carefully read through the specification and the provided code to ensure you have a complete understanding of what is required.

In addition to being worth lab marks, this exercise may also be similar in style/structure to a question you will need to answer in the exam, so it is good practice. That question will also be entirely automarked.

## Specification

In the provided code, the `unsw.collections.Set` interface represents a generic set. Note that this is different to the standard `java.util.Set`. Also provided is a partially complete implementation of this interface in `unsw.collections.ArrayListSet`. In addition to implementing the interface methods, this class also needs to implement the `iterator()` method from `Iterable` and the `equals(...)` method. Your task is to complete it without making any changes to the `Set` interface and ensuring it is consistent with the documentation and contract (including the invariant in `ArrayListSet`).

What follows is a list of the methods that need to be implemented, in rough order of difficulty with the corresponding mark weighting (out of 2 marks - equal to all other labs. Recall that the 12 marks assigned to labs is counted towards 10% of the course).

* `add(...)` - *0.4 marks*
* `subsetOf(...)` - *0.2 marks*
* `iterator()` - *0.2 marks*
* `union(...)` - *0.2 marks*
* `intersection(...)` - *0.2 marks*
* `equals(...)` - *0.8 mark*

Note that the automarking for all tests will assume the `add(..)`, `remove(...)`, `contains(...)`, and `size()` work. Because you are implementing `add(...)` yourselves, it will need to be correct for you to get any marks. You shouldn't need to change `remove(...)`, `contains(...)`, and `size()`.

## Hints

* The `iterator()` method can be implemented in one line.
* For `equals(...)`, you will need to use `instanceof` and wildcards (`?`) in the body of the method.
* Some basic tests have been given, but you will need to write some of your own to check correctness.

## Submission

Make sure that all your work has been pushed to GitLab then submit it with:

```bash
$ 2511 submit lab09
```
