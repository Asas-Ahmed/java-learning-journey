
---

# 🧠 Java Memory: Stack vs. Heap

In Java, memory is mainly split into two areas: **Stack** and **Heap**. This is how your code's data is stored and managed.

### 1\. Stack Memory 🏗️

  * **What it stores:** **Local variables** and **method calls**.
  * **How it works:** Each time a method is called, a new "**stack frame**" is created for it. When the method finishes, its frame is removed.
  * **Key Idea:** It manages the *execution* of your code. Think of it as a tidy stack of plates—first in, last out.

### 2\. Heap Memory 📦

  * **What it stores:** **Objects** (instances of classes) and **instance variables** (the fields inside those objects).
  * **How it works:** Objects live here until the **Garbage Collector** removes them (when they're no longer referenced).
  * **Key Idea:** It manages the *data* (objects) that your program works with.

-----

## 💻 Code Example & Memory Mapping

This code shows how local variables and objects live in different memory spaces.

### Java Code

```java
class Calculator {
    // Instance variable (lives in Heap inside the object)
    int num = 5; 

    public int add(int n1, int n2) {
        // n1 and n2 are local variables (live in 'add' stack frame)
        return n1 + n2;
    }
}

public class Demo {
    public static void main(String a[]) {
        // data is a local variable (lives in 'main' stack frame)
        int data = 10; 
        
        // obj and obj1 are reference variables (live in 'main' stack frame)
        Calculator obj = new Calculator(); // 'new Calculator()' creates an Object in Heap
        Calculator obj1 = new Calculator(); 
        
        int r1 = obj.add(3, 4); // r1 is a local variable
        
        // Changing the instance variable 'num' for *one* object (obj)
        obj.num = 8; 

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
```

### Output

```
8
5
```

-----

## 🗺️ Visualizing Memory

### Stack (Main Method)

| Variable | Type | Value | Location |
| :--- | :--- | :--- | :--- |
| `data` | Local Var | 10 | `main` Stack Frame |
| `obj` | Ref Var | Address **101** | `main` Stack Frame |
| `obj1` | Ref Var | Address **105** | `main` Stack Frame |
| `r1` | Local Var | 7 | `main` Stack Frame |

  * *Note:* The `add` method also gets a temporary stack frame for `n1` (3) and `n2` (4).

### Heap (Objects)

| Address | Object Data |
| :--- | :--- |
| **101** | **Calculator** Object (referenced by `obj`) <br> `num` = **8** (updated) <br> `add()` method code |
| **105** | **Calculator** Object (referenced by `obj1`) <br> `num` = **5** (default) <br> `add()` method code |

  * **The Link:** The reference variables (`obj` and `obj1`) on the **Stack** hold the **addresses** (**101** and **105**) of their respective objects in the **Heap**. That's how the Stack links to the data in the Heap.