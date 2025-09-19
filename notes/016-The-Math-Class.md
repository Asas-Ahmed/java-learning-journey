
---

# The Math Class

---

* **Rounding Numbers**

```java
int result = Math.round(1.1F);    // → 1
int result = (int)Math.ceil(1.1F); // → 2
int result = (int)Math.floor(1.1F); // → 1
```

* **Maximum / Minimum**

```java
int result = Math.max(1, 2);      // → 2
int result = Math.min(1, 2);      // → 1
```

* **Random Numbers**

```java
double result = Math.random();           // → 0.0 to 1.0
double result = Math.random() * 100;     // → 0.0 to 100.0
int result = (int)Math.round(Math.random() * 100); // → 0 to 100
int result = (int)(Math.random() * 100);          // → 0 to 99
```

✅ Tips:

* `Math.round()` returns **int** (for float) or **long** (for double).
* `Math.ceil()` & `Math.floor()` always return **double** → cast to int if needed.
* Random integers 0–n → `(int)(Math.random() * (n + 1))`