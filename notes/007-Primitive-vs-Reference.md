
---

# Primitive vs Reference Type

---

The note clearly highlights the fundamental difference in **memory management** and **assignment** between **Primitive Types** and **Reference Types** in Java (or similar languages).

| Feature | Primitive Type (e.g., `int`, `byte`, `boolean`) | Reference Type (e.g., `Point`, `String`, arrays, objects) |
| :--- | :--- | :--- |
| **Storage** | Stores the **actual value** directly. | Stores a **memory address** (a reference) that points to the actual object data. |
| **Assignment** | **Copies the value.** | **Copies the reference** (the memory address). |
| **Independence** | Variables are completely **independent**. Changing one doesn't affect the other. | Variables can **share the same object**. Changing the object via one variable affects all variables pointing to it. |

-----

## 💡 Code Examples Explained

1.  **Primitive Type (`byte x = 1;`)**

    ```java
    byte x = 1;
    byte y = x; // ➡️ y gets a COPY of the VALUE (1).
    x = 2;      // ➡️ ONLY x's value changes to 2. y is unaffected.
    System.out.println(y); // Output: 1
    ```

      - When `y = x` is executed, the **value** `1` from `x` is copied into `y`. They are two separate boxes with the same initial number.

2.  **Reference Type (`Point point1 = new Point(1, 1);`)**

    ```java
    Point point1 = new Point(1, 1);
    Point point2 = point1; // ➡️ point2 gets a COPY of the REFERENCE (address).
    point1.x = 2;          // ➡️ The object at the SHARED address is modified.
    System.out.println(point2); // Output: java.awt.Point[x=2,y=1]
    ```

      - When `point2 = point1` is executed, the **reference** (the address of the `Point(1, 1)` object in memory) is copied.
      - Both `point1` and `point2` now point to the **exact same object**.
      - Modifying the object using `point1.x = 2` is visible through `point2` because they are looking at the same thing.