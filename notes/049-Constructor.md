
---

# Constructor in Java

A **Constructor** is a special method used to **initialize** an object the moment it's created. It runs automatically when you use the `new` keyword.

-----

### Key Concepts

| Type | Definition | Initialization |
| :--- | :--- | :--- |
| **Default Constructor** | If you write *no* constructor, Java provides one automatically. | Initializes `int` to **0** and `String` to **`null`**. |
| **User-Defined Constructor** | A constructor you write (has the **same name as the class** and **no return type**). | Allows you to set custom initial values for the object's variables. |

### 💡 Why Use a Constructor?

A constructor guarantees that an object is created in a **valid, usable state** by assigning initial values (like setting a default name and age) instead of leaving them at the system defaults (`0` and `null`).

-----

## Code Breakdown and Output Comparison

### 1\. Code 1: Default Constructor (No Explicit Constructor) 👻

The JVM provides an invisible constructor. Variables get default values.

#### Code (Relevant Part)

```java
class Human // No constructor written
{
    private int age;    // Defaults to 0
    private String name; // Defaults to null
    // ...
}

public class Demo
{
    public static void main(String a[])
    {
        Human obj = new Human(); // Default constructor runs
        System.out.println(obj.getName() + " : " + obj.getAge()); // Print defaults
        // ...
    }
}
```

#### Output 1

```
null : 0
```

#### Note

The object is created, but its `name` is `null` and `age` is `0` until we use the `setAge()` and `setName()` methods later.

-----

### 2\. Code 2: User-Defined Constructor (Custom Initialization) ⚙️

We write a constructor to set specific, meaningful starting values.

#### Code (Relevant Part)

```java
class Human
{
    private int age;
    private String name;

    public Human() // <-- User-Defined Constructor
    {
        age = 20;   // Custom initial value
        name = "Bob"; // Custom initial value
    }
    // ...
}

public class Demo
{
    public static void main(String a[])
    {
        Human obj = new Human();  // Constructor runs, sets age=20, name="Bob"
        Human obj1 = new Human(); // Constructor runs AGAIN, sets obj1's age and name
        System.out.println(obj.getName() + " : " + obj.getAge()); 
        // ...
    }
}
```

#### Output 2

```
Bob : 20
```

#### Note

Every time `new Human()` is called, the constructor runs, ensuring the new object (`obj` and `obj1`) starts with the values we defined (`Bob` and `20`).