---
aliases: 
tags: 
---
# Coupling
Is a situation where an object uses another. It could also be thought as collaboration. It is clearly needed to have an object interact with other objects in an OOP Language or an application that was coded using OOP.

> [!INFO] Definition  
>  Coupling is the degree of interdependence between software modules; a measure of how closely connected two routines or modules are; the strength of the relationships between modules.

When defining coupling, we must consider the following properties.

## Properties
### Degree
The number of connections between the module and others.  
We want this number to be as low as possible, meaning we have a small and concise interface between them.

### Ease
How simple or complicated it is to understand the connection made between 2 objects.

### Flexibility
How easy it would be to replace the module (other object) this object is using. Ideally, we want to be able to change modules rapidly and with no issue.  
For example an object User sends mails, it should be the same for it to send using POP, SMTP or any other email protocol.

## Tight Coupling
It's characterized by:
- More interdependency
- More coordination
- More information-flow
```java
class Volume {
    public static void main(String[] args) {
        Box box = new Box(5, 10, 5);
        System.out.println(box.volume);
    }
}

class Box {
    public int volume;

    Box(int length, int width, int height) {
        this.volume = length * width * height;
    }
}
```

### Problems
- A change in one module usually forces a ripple effect due to changes in other modules
- A tightly coupled module is much harder to test and reuse.

## Loose Coupling
The ideal implementation of collaboration between modules (objects). It's characterized by:
- Less interdependency
- Less coordination
- Less information flow.
```java
class Volume {
    public static void main(String[] args) {
        Box box = new Box(5, 10, 5);
        System.out.println(box.getVolume());
    }
}

final class Box {
    private int volume;

    Box(int length, int width, int height) {
        this.volume = length * width * height;
    }

    public int getVolume() {
        return volume;
    }
}
```

## Tight vs Loose Coupling

![[Coupling_sketches_cropped_1.svg.png]]

## OOP Types
### Subclass
It describes the relationships between parent and child class. Child is connected to Parent, not the other way around.

### Temporal
When 2 actions are in the same module just because they happen at the same time.

### Semantic
It considers the conceptual similarities between software and the things it was abstracted from. For example, comments and identities.

### Logical
Based on the release/change history a logical coupling pattern can be found, if the same classes get changed in the multiple different releases.

