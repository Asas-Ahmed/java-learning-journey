
---

# Static Block in java

A **Static Block** is a special block of code in a class that runs **only once** when the class is first **loaded** into the Java Virtual Machine (JVM).

-----

### Key Concepts

| Feature | Description | When It Runs |
| :--- | :--- | :--- |
| **Static Block** | Used to initialize **static variables**. It's the first code to execute when the class loads. | **Once**, when the class is loaded by the JVM's Class Loader. |
| **Constructor** | Used to initialize **instance variables** and perform setup for a new object. | **Every time** a new object is created (`new Mobile()`). |
| **Class Loading** | The process where the JVM finds the `.class` file and reads its structure into memory. | Triggered by: **1.** Creating an object (`new Mobile()`) or **2.** Referencing a static member (`Mobile.name`) or **3.** Explicitly loading (`Class.forName()`). |

### 🚨 The Power of `Class.forName()`

The `Class.forName("...")` method explicitly tells the JVM to load the class specified by the String name. This is the **minimal trigger** needed to execute the **Static Block**, even if no objects are created\!

-----

## Code Breakdown

### 1\. The `Mobile` Class

```java
class Mobile
{
    String brand;
    int price;
    static String name; // Static variable

    // Constructor (Runs on 'new Mobile()')
    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    // Static Block (Runs ONCE when class is loaded)
    static
    {
        name = "Phone"; // Initialization for the static variable 'name'
        System.out.println("in static block");
    }
    // ... show() method
}
```

### 2\. The `Demo` Class (Main Logic)

```java
public class Demo
{
    public static void main(String a[]) throws ClassNotFoundException
    {
        // This line forces the JVM to LOAD the Mobile class.
        // Loading the class is enough to trigger the static block.
        // NOTE: No objects are created (no 'new Mobile()').
        Class.forName("com.asaslabs.Mobile");

        // The commented-out lines below would ALSO trigger the static block
        // (because object creation involves class loading), AND the constructor.
    }
}
```

-----

## Output

```
in static block
```

**Why this output?** The main method explicitly calls `Class.forName("...")`. This action triggers the JVM's **Class Loader** to load the `Mobile` class. When the class is loaded, the **static block** executes, printing its message and initializing the static variable `name`. Since `new Mobile()` is commented out, the constructor never runs.