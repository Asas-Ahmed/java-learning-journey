
---

# 📝 Java Multi-dimensional Arrays

---

A **multi-dimensional array** is essentially an array of arrays. The most common is the **two-dimensional array**, which is often visualized as a grid or a table (rows and columns).

To properly print a multi-dimensional array, you must use the special helper method **`Arrays.deepToString()`**.

```java
import java.util.Arrays;
```

-----

### 1\. Declaring and Accessing

**Option A: Pre-allocating Size**

This declares an array with **2 rows** and **3 columns** (`[2][3]`). Access is via `[row_index][column_index]`.

```java
public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers [0][0] = 1; // Set value at Row 0, Column 0
        
        System.out.println(Arrays.deepToString(numbers));
    }
}
```

```
[[1, 0, 0], [0, 0, 0]]
```

-----

**Option B: Initializing with Values**

You initialize the array using nested curly braces, where each inner set of braces is a **row**.

```java
public class Main {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3}, {4,5,6}}; // 2 rows, 3 columns
        
        System.out.println(Arrays.deepToString(numbers));
    }
}
```

```
[[1, 2, 3], [4, 5, 6]]
```