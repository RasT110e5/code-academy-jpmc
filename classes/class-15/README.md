# Class 15 - Most used APIs and Generics

In this class we will discuss and see some examples of Steam and Optional api.
Also we will be seeing one of the necessary tools to fully utilize java, Generics, reviewing some examples in the project contained in the class's [Project](/classes/class-15/code/src/class_15/).

## Stream Api
----
> *Base resource to quickly learn the Stream Api in java: https://www.geeksforgeeks.org/stream-in-java/*

The Stream API was introduced in Java 8 and it allows developers to quickly process a `Collection<E>`
performing multiple common intermediate processes and returning one result at the end,
without changing the original `Collection<E>`.In Java 11 this API offers 5 processes, divided in Intermediate and Terminal operations.

### Intermediate:
- **map**: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
- **filter**: The filter method is used to select elements as per the Predicate passed as argument.
- **sorted**: The sorted method is used to sort the stream.

### Terminal

- **collect**: The collect method is used to return the result of the intermediate operations performed on the stream.
- **forEach**: The forEach method is used to iterate through every element of the stream.
- **reduce**: The reduce method is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter.

## Optional Api
Starting on java 8, java included the Optional API, its main porpoise is to mitigate the appearance of `NullPointerException` and the inevitable checks that come with it.
> *Base resource to quickly learn the Optional Api in java: https://www.geeksforgeeks.org/java-8-optional-class/

## Generics
Generics are the tool used when abstracting an implementation that worked with multiple different types. It adds static type safety. We can observe the use of generics in each of the collections classes we have seen `List<E>`, `Set<T>`, `Map<K, V>`, etc.

Generics can be applied as "parameters" of classes and methods. Meaning they can determine what a method takes and returns or how a class's methods will respond (as we can see in the collections).

### Method Example
![generic method](/classes/class-15/img/generic_method.png)

### Class Example
How can we not repeat code when implementing features that are equal but need to work with different types. Like this one:

![use1](/classes/class-15/img/generic_class_use_1.png)

![use2](/classes/class-15/img/generic_class_use_2.png)

We have a Generic class for this table object.
![generic class](/classes/class-15/img/generic_class.png)