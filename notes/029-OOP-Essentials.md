
---

# Object-Oriented Programming (OOP) Essentials 🚀

OOP is a programming paradigm based on the concept of **objects**, which can contain data (fields/properties) and code (methods/functions).

### 📝 Core Concept: Objects

In **Procedural Programming**, data and functions are often separate. OOP bundles them:

| Procedural | Object-Oriented |
| :--- | :--- |
| **Data** and **functions** are separate. | Group **properties (data)** and **methods (functions)** into a single unit: an **Object**. |

**Example:** A **Car** object would have properties like `make`, `model`, `color` and methods like `start()`, `stop()`, `accelerate()`.

-----

## The Four Pillars of OOP

The four pillars are fundamental concepts that guide object-oriented design.

### 1\. Encapsulation 🛡️

  * **What it is:** Bundling data (variables) and the methods that operate on that data into a single unit (**an object**). It's like a capsule containing both.
  * **Goal:** Control access to the data, protecting it from unwanted external modification.
  * **Benefits:** **Reduces complexity** and **increases reusability**.

#### **Java Example: Encapsulation**

```java
// Encapsulation example: Employee class
public class Employee {
    // 1. Private fields (data is protected)
    private double baseSalary = 30000;
    private int overtimeHours = 10;
    private double rate = 20;

    // 2. Public method (controlled access to calculate wage)
    public double getWage() {
        return baseSalary + (overtimeHours * rate);
    }

    // Optional: Getter for controlled reading of data
    public double getBaseSalary() {
        return baseSalary;
    }
}

// In another file/method:
// Employee emp = new Employee();
// double wage = emp.getWage(); // Only way to access/calculate is through the method
// // emp.baseSalary = 0; // NOT allowed because baseSalary is private!
```

-----

### 2\. Abstraction 🕶️

  * **What it is:** Showing only **essential information** to the user and **hiding the complex implementation details**.
  * **Goal:** Focus on *what* the object does, not *how* it does it. A user interacts with a simple interface.
  * **Benefits:** **Reduces complexity** (simple interface) and **isolates the impact of changes** (if the hidden implementation changes, the user interface remains the same).

#### **Java Example: Abstraction**

```java
// Abstraction example: The user only sees the 'run' method
abstract class Motor {
    // Abstract method: MUST be implemented by subclasses, but no details here (hides HOW it runs)
    abstract void run();
}

class Car extends Motor {
    // Concrete implementation (the details are hidden from the general 'Motor' interface)
    void run() {
        System.out.println("Car is running using an internal combustion engine.");
    }
}

// The user code:
// Motor vehicle = new Car();
// vehicle.run(); // User only knows they can 'run' it, not the complex engine details.
```

-----

### 3\. Inheritance 🧬

  * **What it is:** A mechanism where one class (**subclass/child**) acquires the properties and methods of another class (**superclass/parent**).
  * **Goal:** Establish an "is-a" relationship (e.g., a Dog *is a* Mammal).
  * **Benefit:** **Eliminates redundant code** (reuse common logic from the parent class).

#### **Java Example: Inheritance**

```java
// Superclass (Parent)
class Animal {
    public void eat() {
        System.out.println("This animal eats food."); // Common method
    }
}

// Subclass (Child) inherits from Animal
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks."); // Dog-specific method
    }
    // Dog automatically gets the 'eat()' method from Animal.
}

// In another file/method:
// Dog myDog = new Dog();
// myDog.eat(); // Reusing the method from Animal
// myDog.bark(); // Dog-specific method
```

-----

### 4\. Polymorphism 🎭

  * **What it is:** The ability of an object to take on **many forms**. Specifically, a single interface (method name) can be used for different underlying forms (types).
  * **Goal:** Write more flexible and generic code that can handle various types of objects gracefully.
  * **Benefit:** Allows you to **get rid of ugly `if`/`else` or `switch` statements** by having methods handle specific logic in different classes.

#### **Java Example: Polymorphism**

```java
// Polymorphism example (Method Overriding)
class Shape {
    public void draw() {
        System.out.println("Drawing a general shape.");
    }
}

class Circle extends Shape {
    // Overriding the method to provide a specific implementation
    public void draw() {
        System.out.println("Drawing a circle with a specific radius.");
    }
}

class Square extends Shape {
    // Overriding the method to provide a specific implementation
    public void draw() {
        System.out.println("Drawing a square with four equal sides.");
    }
}

// In another file/method:
// Polymorphism in action: The same 'draw()' call behaves differently based on the actual object type
Shape s1 = new Circle();
Shape s2 = new Square();

s1.draw(); // Calls Circle's draw()
s2.draw(); // Calls Square's draw()
```