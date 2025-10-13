
---

# 📝 Java Math Class

---

The **`Math`** class provides static methods for performing basic numeric operations, such as elementary exponential, logarithm, square root, and trigonometric functions.

### 1\. Rounding and Truncating

| Method | Description | Code & Result | Tip |
| :--- | :--- | :--- | :--- |
| **`Math.round()`** | Rounds to the **nearest whole number**. | `Math.round(1.1F)` $\rightarrow$ **1** | Returns `int` (for `float`) or `long` (for `double`). |
| **`Math.ceil()`** | Rounds **up** to the nearest whole number. | `(int)Math.ceil(1.1F)` $\rightarrow$ **2** | Returns `double` $\rightarrow$ must be cast to `int`. |
| **`Math.floor()`** | Rounds **down** to the nearest whole number. | `(int)Math.floor(1.1F)` $\rightarrow$ **1** | Returns `double` $\rightarrow$ must be cast to `int`. |

-----

### 2\. Max and Min Values

Used to find the larger or smaller of two numbers.

| Method | Description | Code & Result |
| :--- | :--- | :--- |
| **`Math.max()`** | Returns the **larger** of the two values. | `Math.max(1, 2)` $\rightarrow$ **2** |
| **`Math.min()`** | Returns the **smaller** of the two values. | `Math.min(1, 2)` $\rightarrow$ **1** |

-----

### 3\. Generating Random Numbers

The `Math.random()` method returns a pseudo-random **`double`** value between $0.0$ (inclusive) and $1.0$ (exclusive).

| Code | Range | Description |
| :--- | :--- | :--- |
| `Math.random()` | $0.0$ to $1.0$ | The default range. |
| `Math.random() * 100` | $0.0$ to $100.0$ | Scales the result. |
| `(int)Math.round(Math.random() * 100)` | $0$ to $100$ | Rounds the scaled double, guaranteeing $100$ is included. |
| `(int)(Math.random() * 100)` | $0$ to $99$ | Truncates the decimal, resulting in $0$ up to $99$. |

**Tip for a specific integer range (0 to N):**

```java
// Formula to get a random integer from 0 to N (inclusive)
int randomInt = (int)(Math.random() * (N + 1)); 
```

Example: $0 \text{ to } 5 \rightarrow$ `(int)(Math.random() * 6)`