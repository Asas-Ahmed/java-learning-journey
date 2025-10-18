
---

# Getters and Setters in Java

**Getters** (Accessors) and **Setters** (Mutators) are public methods used to **control access** to private instance variables, making them the cornerstone of **Encapsulation**.

-----

### Key Concepts

| Method Type | Purpose | Naming Convention | Example |
| :--- | :--- | :--- | :--- |
| **Getter** (Accessor) | To **READ** (retrieve) the value of a private variable. | Starts with `get` (or `is` for boolean). | `public int getAge()` |
| **Setter** (Mutator) | To **WRITE** (modify/set) the value of a private variable. | Starts with `set`. | `public void setAge(int age)` |
| **`this` Keyword** | Used inside the setter to differentiate between the **instance variable** (`this.age`) and the **local parameter** (`age`). | `this.age = age;` |

### 💡 Why Use Them?

1.  **Data Validation:** Setters allow you to enforce rules (e.g., age must be positive) before a variable is changed.
2.  **Read-Only:** By only providing a **Getter** (and no Setter), you can make a variable read-only from outside the class.
3.  **Encapsulation:** They hide the internal data structure, allowing you to change variable names or data types inside the class without breaking external code.

-----

## Code Breakdown

### 1\. The `Human` Class

```java
class Human
{
    // Private Instance Variables (Hidden Data)
    private int age = 19;
    private String name = "John";

    // Getter for 'age' (Allows viewing)
    public int getAge() {
        return age;
    }

    // Setter for 'age' (Allows modification)
    public void setAge(int age) {
        // 'this.age' refers to the private variable. 'age' refers to the parameter.
        this.age = age; 
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }
}
```

### 2\. The `Demo` Class (Main Logic)

```java
public class Demo
{
    public static void main(String a[])
    {
        Human obj = new Human();
        
        // 1. Set values using the Setters
        // (This is how we safely pass new data into the private variables)
        obj.setAge(19);
        obj.setName("John");

        // 2. Get values using the Getters
        // (This is how we retrieve the current data)
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
```

-----

## Output

```
John : 19
```

**Observation:** The initial values set in the variable declaration (`age = 19`, `name = "John"`) are immediately overwritten by the explicit calls to the **Setters** in the `main` method, and the **Getters** retrieve the final, correct values.