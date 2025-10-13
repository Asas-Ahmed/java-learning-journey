
---

# 📝 Java Casting

---

**Casting** is the process of converting one data type to another.

### 1\. Types of Casting

| Type | Description | Example Flow |
| :--- | :--- | :--- |
| **Implicit (Automatic)** | **Widening** (Small $\rightarrow$ Big). Java does this automatically because there is **no data loss**. | `byte` $\rightarrow$ `short` $\rightarrow$ `int` $\rightarrow$ `long` $\rightarrow$ `float` $\rightarrow$ `double` |
| **Explicit (Manual)** | **Narrowing** (Big $\rightarrow$ Small). You must manually specify the target type using parentheses. **Data loss is possible**. | `(int) 1.9` $\rightarrow$ `1` (Decimal part lost) |

-----

### 2\. Code Examples

**Implicit Casting** (Small to Big: `short` $\rightarrow$ `int`):

```java
// short x is automatically widened to int during the addition.
short x = 1;
int y = x + 2; 
System.out.println(y);
```

```
3
```

**Implicit Casting** (Small to Big: `int` $\rightarrow$ `double`):

```java
// The integer 2 is implicitly converted to 2.0 to match the double x.
double x = 1.1;
double y = x + 2; 
System.out.println(y);
```

```
3.1
```

**Explicit Casting** (Big to Small: `double` $\rightarrow$ `int`):

```java
// The decimal part of x is truncated (lost) when cast to int.
double x = 1.1;
int y = (int)x + 2; // (int)1.1 becomes 1
System.out.println(y);
```

```
3
```

-----

### 3\. Parsing Strings to Numbers

Use **Parse** methods to convert a `String` (text) that *looks* like a number into an actual numeric type.

**Parsing to Integer:**

```java
String x = "1";
int y = (Integer.parseInt(x)) + 2;
System.out.println(y);
```

```
3
```

**Parsing to Double:**

```java
String x = "1.1";
double y = (Double.parseDouble(x)) + 2;
System.out.println(y);
```

```
3.1
```