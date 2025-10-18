
---

# Static Methods in Java

Static methods and variables belong to the **class** itself, not to any specific **object** (instance) of the class.

-----

### Key Concepts

| Concept | Description | Example |
| :--- | :--- | :--- |
| **`static` Keyword** | Used to declare a method or variable that belongs to the **class**. | `static String name;` |
| **Static Variable** | A variable shared by *all* objects of the class. Changing it in one object changes it for all. | `name` (the type of phone) |
| **Instance Variables** | Variables unique to *each* object. | `brand`, `price` |
| **Static Method** | A method that can be called directly using the **Class Name** (e.g., `Mobile.show1()`). | `public static void show1(...)` |

### 🚨 The Big Rule for Static Methods

A static method **cannot directly access** instance (non-static) variables or instance methods. Why? Because a static method exists *without* an object, and instance members *need* an object to exist.

  * ✅ A static method **can** access **static** variables (e.g., `name`).
  * ❌ A static method **cannot** access **instance** variables (e.g., `brand`, `price`) **unless** an object is passed to it.

-----

## Code Breakdown

### 1\. The `Mobile` Class

```java
class Mobile
{
    String brand; // Instance variable (unique per phone)
    int price;    // Instance variable (unique per phone)
    static String name; // Static variable (shared by ALL phones)

    // Instance Method (Needs an object: obj1.show())
    public void show()
    {
        // Can access both instance and static members
        System.out.println(brand + " : " + price + " : " + name);
    }

    // Static Method (Called via Class: Mobile.show1(obj1))
    public static void show1(Mobile obj)
    {
        // Accessing instance variables (brand, price) through the passed 'obj'
        // Accessing static variable (name) directly
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}
```

### 2\. The `Demo` Class (Main Logic)

```java
public class Demo
{
    public static void main(String a[])
    {
        // Create objects
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        // 1. Set Instance Variables (unique)
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj2.brand = "Samsung";
        obj2.price = 1700;

        // 2. Set Static Variable (shared)
        Mobile.name = "SmartPhone"; // Set once, applies to ALL objects!

        // 3. Change Static Variable
        // This is the LAST change, so 'name' will be "Phone" for everyone.
        Mobile.name = "Phone";

        // Call Instance Methods
        obj1.show(); // Accesses obj1's data + the SHARED 'name'
        obj2.show(); // Accesses obj2's data + the SHARED 'name'

        // Call Static Method (passing the object 'obj1' to access its instance data)
        Mobile.show1(obj1);
    }
}
```

-----

## Output

```
Apple : 1500 : Phone
Samsung : 1700 : Phone
Apple : 1500 : Phone
```

**Why "Phone" for all?** Because `Mobile.name` is **static** and its final value before the print statements is `"Phone"`.