---
aliases: SOLID
tags: 
---
# SOLID Principles

Set of principles that help write good quality software solutions. It is often used with software that follows OOP. It is an acronym that stands for:

**S**ingle Responsibility
**O**pen/closed
**L**iskov's subsitution
**I**nterface segregation
**D**ependency inversion

## Single Responsibility Principle (SRP)

A software module needs to serve only one responsibility. This concept is tightly related to the concepts of [[Coupling]] and specially with [[Cohesion]]. Following the SRP you can achieve loose coupling and high cohesion. If not, the typical disadvantages of having tight coupling and low cohesion occur.

For example, take class A that has the following responsibilities:
- Connecting to the database
- Fetch data from database
- Write data to the database

Given those responsibilities, what would happen if one of the following changes occured?
-   New database
-   Adopt ORM to manage queries on database
-   Change in the output structure

All of this changes affect class A and its elements. Most likely, each change would affect multiple elements. 

## Open/Closed Principle

Classes should be open for extension but closed for modification. This is specially true when using libraries/dependencies. 

If a developer is using a class from a specific library, instead of modifying it, they can create their own class that **extends** from the origin class.

## Liskov's Subsitution Principle

Parent classes should be easily substituted with their child classes without blowing up the application.

```java
public class Animal {
    public void makeNoise() {
        System.out.println("I am making noise");
    }
}

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("bow wow");
    }
}

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("meow meow");
    }
}
```

In this example, if we use the class Dog whenever the class Animal is used, our application would not stop working. Sure it will give different results, but it **would not break**.

The next example does not follow the principle and would therefore break the app:

```java
class DumbDog extends Animal {
    @Override
    public void makeNoise() {
        throw new RuntimeException("I can't make noise");
    }
}
```

## Interface Segregation Principle

Many interfaces are better than having one general interface. Remember that interfaces force the implementation of their methods. If there is only one interface with many methods, then the scope of classes that can/should implement that interface will be lower.

However if there are many interfaces, each class can implement multiple, according to their responsibility.

This is similar to SRP, but this principle applies to interfaces while SRP is for classes.

## Dependency Inversion

Perhaps the tougher principle to understand, it is closely related to the concept of [[Coupling]]. It is also related to the concept of [Connascence](https://en.wikipedia.org/wiki/Connascence)

Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.

In other words:

- High-level modules/classes should not depend on low-level modules/classes. Both should depend upon abstractions.
- Abstractions should not depend upon details. Details should depend upon abstractions.

The above lines simply state that if a high module or class will be dependent more on low-level modules or class then your code would have tight coupling and if you will try to make a change in one class it can break another class which is risky at the production level. So always try to make classes loosely coupled as much as you can and you can achieve this through _abstraction_ (abstract classes and interfaces).

For example, take a TV controller and its batteries. Your remote needs a battery but it’s not dependent on the battery brand. You can use any XYZ brand that you want and it will work. So we can say that the TV remote is loosely coupled with the brand name. 