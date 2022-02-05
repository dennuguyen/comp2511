# Tutorial 3

## Lists

Refactor the code in `lists.ListExample` to make better use of Java `List`s

## Quick questions

1. What is method overriding?
2. Can you override a static method?
3. What is output by executing `A.f()` in the following?

    ```java
    public class A {
        public static void f() {
            C c = new C();
            c.speak();
            B b = c;
            b.speak();
            b = new B();
            b.speak();
            c.speak();
        }
    }


    public class B {
        public void speak() {
            System.out.println("moo");
        }
    }


    public class C extends B {
        public void speak() {
            System.out.println("quack");
        }
    }
    ```

    > ```
    > quack
    > quack
    > moo
    > quack
    > ```

4. What is output by executing `A.f()` in the following?

    ```java
    public class A {
        public static void f() {
            B b1 = new B();
            B b2 = new B();
            b1.incX();
            b2.incY();
            System.out.println(b1.getX() + " " + b1.getY());
            System.out.println(b2.getX() + " " + b2.getY());
        }
    }

    public class B {
        private int x;
        private static int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void incX() {
            x++;
        }

        public void incY() {
            y++;
        }
    }
    ```

    > ```
    > 1 1
    > 0 1
    > ```

## Java Exercise

This exercise continues from the `Employee` exercise in the week 2 tutorial.

Create a `Manager` class that is a subclass of `Employee` and has a field for the manager's hire date.

> See code

* What constructors are appropriate?

* Is it appropriate to have a getter for the hire date? What about a setter?

