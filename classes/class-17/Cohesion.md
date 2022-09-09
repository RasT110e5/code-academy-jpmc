---
aliases: 
tags: 
---
# Cohesion

> [!INFO] Definition  
>  The degree to which the elements in a module belong together.

In OOP, it relates to the relationship between the methods and the attributes of a class, and the purpose that class serves.

It is normally rated as "high" or "low". High quality software has **high** cohesion.

The concept of cohesion is normally related to the concept of [[Coupling]]. 

## High vs Low Cohesion

![[CouplingVsCohesion.png]]

### High cohesion software

- Robustness
- Reliability
- Reusability
- Understandability

### Low cohesion software

- Maintenance requires more effort
- Testing requires more effort
- Low reusability
- Harder to understand

## Types of Cohesion
(From worst to best)

### Coincidental
In this cohesion type, the parts of a module have been arbitrarily put together. Parts are related only by the fact of having been put together.

## Logical
Grouping occurs because the parts of a module serve the same purpose (i.e. do the same thing) even though they are different. For example, the MVC pattern groups.

### Temporal
Parts of a module are grouped by when they are processed. For example, a function that is called after catching an exception which closes open files, creates an error log and then notifies the user.

### Procedural
Grouping occurs because module parts follow a certain execution sequence. For example, checking permissions and the opening a file.

### Communicational/Informational
Parts of a module are grouped together because they operate on the same data.

### Sequential
The output of a part of a module is the input of the other part of a module.

### Functional
This is the best type of cohesion. Parts of a module are grouped together because they contribute to the same single and well-defined purpose the module has.

```
/*
Groups: The function definitions
Parts: The terms on each function
*/
Module A {
  /*
  Implementation of arithmetic operations
  This module is said to have functional cohesion because 
  there is an intention to group simple arithmetic operations
  on it. 
  */
  a(x, y) = x + y
  b(x, y) = x * y
}

Module B {
  /*
  Module B: Implements r(x) = 5x + 3
  This module can be said to have atomic cohesion. The whole
  system (with Modules A and B as parts) can also be said to have functional
  cohesion, because its parts both have specific separate purposes. 
  */
  r(x) = [Module A].a([Module A].b(5, x), 3)
}
```

Functiona cohesion should be the desired cohesion type to achieve. However, complexity may hinder that objective. If that happens, communicational cohesion may be the highest level of cohesion achievable.

### Atomic/Perfect
There is only one part to a module. Since cohesion is a measure that occurs due to relationships of parts within a module, if there is only one part then cohesion is infinite (or cero depending on your outlook of life).