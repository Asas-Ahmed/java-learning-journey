
---

# Encapsulation in Java

**Encapsulation** is the OOP concept of **binding data (variables) and the methods (getters/setters) that operate on that data into a single unit (the class)**. It's often called "data hiding."

-----

### Key Concepts

| Concept | Description | Why It Matters |
| :--- | :--- | :--- |
| **Data Hiding** | Declaring variables as **`private`**, preventing direct access from outside the class. | **Security/Integrity:** Protects data from being accidentally or maliciously changed. |
| **Accessors** | **`public`** **Getter methods** (e.g., `getAge()`) used to **read** (get) the private variable's value. | **Read Control:** Provides controlled access to view the data. |
| **Mutators** | **`public`** **Setter methods** (e.g., `setAge()`) used to **modify** (set) the private variable's value. | **Write Control:** Allows you to add **validation logic** (e.g., age must be \> 0) before modifying the data. |

### 🧠 Analogy

Think of a **Pill Capsule** 💊. The medicine (data) is hidden inside the plastic shell (class) and can only be accessed through the designed opening (public getter/setter methods).

-----

## Code Breakdown

### 1\. The `Human` Class (The Encapsulated Data)

```java
class Human
{
    // PRIVATE Data (The Secret): Cannot be accessed directly from Demo
    private int age = 19;
    private String name = "John";

    // PUBLIC Getters (The Readers): How you VIEW the data
    public int getAge() { return age; }
    public String getName() { return name; }

    // PUBLIC Setters (The Writers): How you CHANGE the data
    // You could add validation here: e.g., if (a > 0) { age = a; }
    public void setAge(int a) { age = a; }
    public void setName(String n) { name = n; }
}
```

### 2\. The `Demo` Class (Main Logic)

```java
public class Demo
{
    public static void main(String a[])
    {
        Human obj = new Human();

        // 1. Setting Data: Use the public setters instead of direct access
        // (obj.age = 50;  <-- This would cause an error because 'age' is private)
        obj.setAge(19);
        obj.setName("John");

        // 2. Getting Data: Use the public getters to retrieve the values
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
```

-----

## Output

```
John : 19
```

**Key Takeaway:** We successfully initialized and retrieved the private data (`age` and `name`) **without** directly accessing them, using the controlled gateway of **getters and setters**.