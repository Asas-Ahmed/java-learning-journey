
---

# Class and Object Theory in Java

### 1\. The Object (The Real Thing) 💡

An **Object** is a real-world entity that has **properties** (data/state) and **behavior** (actions/methods). It's the core component of OOP.

| Component | Analogy | Java Term |
| :--- | :--- | :--- |
| **Properties** (What it **is**) | Color, Model, Speed | **Fields** (Variables) |
| **Behavior** (What it **does**) | Start, Stop, Accelerate | **Methods** (Functions) |

**Example:**

  * **Object:** My specific blue Honda Civic.
  * **Properties:** `color = "blue"`, `speed = 60`.
  * **Behavior:** `accelerate()`, `brake()`.

-----

### 2\. The Class (The Blueprint) 📐

A **Class** is a **template** or **blueprint** from which objects are created. It defines the structure (properties and methods) that all objects of that type will share.

  * **A Class is NOT an object;** it's just the definition.
  * It serves as a **User-Defined Data Type**.

| Feature | Class | Object |
| :--- | :--- | :--- |
| **Nature** | Logical (Blueprint) | Physical (Instance) |
| **Memory** | Doesn't allocate memory | Allocates memory when created |
| **Creation** | Defined once | Can be created multiple times |

#### **Java Example: Defining a Class**

```java
// CLASS: The blueprint for all 'Car' objects
public class Car {
    // Properties (Fields/State)
    String model;
    String color;

    // Behavior (Methods)
    public void start() {
        System.out.println(model + " has started!");
    }
}
```

-----

### 3\. Creating Objects (Instantiation) 🏗️

Creating an object from a class is called **Instantiation**. In Java, you use the `new` keyword.

```java
// Main method where the code runs
public class Demo {
    public static void main(String a[]) {
        // 1. Instantiation: Creates a new Car object named 'myCar'
        Car myCar = new Car(); 
        
        // 2. Accessing and setting Properties
        myCar.model = "Honda Civic";
        myCar.color = "Blue";
        
        // 3. Calling Behavior (Methods)
        myCar.start(); // Output: Honda Civic has started!
    }
}
```

**In summary:** The **Class** defines the structure, and the **Object** is the actual functional entity created from that structure.