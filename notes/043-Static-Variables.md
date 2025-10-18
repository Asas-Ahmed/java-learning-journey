
---

# 💡 Static Variables in Java

A **Static Variable** (also known as a **Class Variable**) belongs to the class itself, not to any specific object of that class. There is only **one copy** of a static variable, shared by all instances.

### 🔑 Key Concepts

| Type | Definition | Memory Location | Access |
| :--- | :--- | :--- | :--- |
| **Instance** Variable (`brand`, `price`) | Unique to each object (instance). | **Heap** (within the object block). | Access via **Object Reference** (`obj1.brand`). |
| **Static** Variable (`name`) | Shared by **all** objects of the class. | **Class Area** (Method Area) in the JVM. | Access via **Class Name** (Preferred: `Mobile.name`). |

### 🧠 Static Variable in Memory

Unlike instance variables, the static variable `name` is stored in a separate area of the JVM and is shared.

| Memory Area | Content |
| :--- | :--- |
| **Stack** | `obj1` reference, `obj2` reference. |
| **Heap** | Object data for `obj1` (`brand="Apple"`, `price=1500`). |
| **Class Area** | The single copy of the static variable $\rightarrow$ **`name = "Phone"`**. |

-----

### 💻 Static Variable Example

The example shows that changing the static variable using one reference or the class name affects **all** objects.

```java
package com.asaslabs;

class Mobile {
    String brand;
    int price;
    static String name; // Static variable (shared)

    public void show() {
        // All objects share the same 'name' value
        System.out.println(brand + " : " + price + " : " + name); 
    }
}

public class Demo {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        
        // 1. Initialise the static variable using the Class Name (Best Practice)
        Mobile.name = "SmartPhone"; 

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        // 2. Change the static variable's value
        // This change affects BOTH obj1 and obj2
        Mobile.name = "Phone"; 

        obj1.show();
        obj2.show();
    }
}
```

### 💡 Output

Both output lines reflect the **final change** to the static variable (`"Phone"`):

```
Apple : 1500 : Phone
Samsung : 1700 : Phone
```