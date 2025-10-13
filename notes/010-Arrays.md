
---

# 📝 Java Arrays

---

Arrays are fixed-length data structures used to store multiple values of the **same data type**. Once created, their size cannot be changed.

You need to **import** the `java.util.Arrays` class to use helper methods like `toString()` and `sort()`.

```java
import java.util.Arrays;
```

-----

### 1\. Declaring and Initializing

**Option A: Pre-allocating Size**

Declares an array of 5 integers. Unassigned spots default to `0`.

```java
int[] numbers = new int[5];
numbers[0] = 1;
numbers[1] = 2;

System.out.println(Arrays.toString(numbers));
```

```
[1, 2, 0, 0, 0]
```

**Option B: Initializing with Values**

Creates an array with the exact number of elements provided.

```java
int[] numbers = {2,3,5,1,4};

System.out.println(Arrays.toString(numbers));
```

```
[2, 3, 5, 1, 4]
```

-----

### 2\. Properties and Methods

**Length** (The number of elements):

```java
int[] numbers = {2,3,5,1,4};
System.out.println(numbers.length);
```

```
5
```

**Sorting** (Arranges elements in ascending order):

```java
int[] numbers = {2,3,5,1,4};
Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));
```

```
[1, 2, 3, 4, 5]
```