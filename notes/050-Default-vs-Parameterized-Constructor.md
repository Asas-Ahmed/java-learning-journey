
---

# Default vs Parameterized Constructor in Java

Java classes can have **multiple constructors** as long as they have different **parameter lists** (a concept known as **Constructor Overloading**). This lets you create objects with different initial states.

-----

### Key Concepts

| Constructor Type | Signature | Purpose | Example Call |
| :--- | :--- | :--- | :--- |
| **Default (No-Arg)** | `public Human()` | Initializes an object with **fixed, default values**. | `new Human()` |
| **Parameterized** | `public Human(...)` | Initializes an object using values **passed** when the object is created. | `new Human(25, "Alice")` |

### 🚨 Note on Syntax

There is a small syntax error in your provided code: `this.int age = 19;` should just be `this.age = 19;`. Variables are declared only once at the class level. The corrected code is used below.

-----

## Code Breakdown

### 1\. The `Human` Class (Overloaded Constructors)

```java
class Human
{
    private int age;
    private String name;

    // 1. Default (No-Arg) Constructor
    public Human() 
    {
        this.age = 19;  // Fixed default age
        this.name = "Bob"; // Fixed default name
    }

    // 2. Parameterized Constructor (Single String)
    public Human(String name) {
        this.age = 20;
        this.name = name; // Age fixed, but name is passed
    }

    // 3. Parameterized Constructor (Int and String)
    public Human(int age, String name)
    {
        this.age = age;   // Both values are passed
        this.name = name;
    }
    // ... getters/setters ...
}
```

### 2\. The `Demo` Class (Main Logic)

```java
public class Demo
{
    public static void main(String a[])
    {
        // Calls the Default (No-Arg) Constructor (Human())
        Human obj = new Human();
        
        // Calls the Parameterized Constructor (Human(String name))
        Human obj1 = new Human("John"); 
        
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
```

-----

## Output

```
Bob : 19
John : 20
```

**Observation:**

  * **`obj`** was created using the **Default Constructor**, so it received the fixed values of **Bob** and **19**.
  * **`obj1`** was created using the **Parameterized Constructor** that accepts a `String`, so its name is the passed value **John**, and its age is the fixed value **20** defined inside that constructor.