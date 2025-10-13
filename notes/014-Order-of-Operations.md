
---

# 📝 Java Order of Operations

---

Java follows standard mathematical **operator precedence** (the order in which operations are performed).

### Order of Precedence

The operations are executed in this sequence:

| Order | Operators | Description |
| :--- | :--- | :--- |
| **1st** | **`()`** | **Parentheses** (Expressions inside these are always evaluated first). |
| **2nd** | **`*`, `/`, `%`** | **Multiplication, Division, Modulus** (Evaluated from left to right). |
| **3rd** | **`+`, `-`** | **Addition, Subtraction** (Evaluated from left to right). |

-----

### Code Examples

**Example 1: Multiplication before Addition**

Multiplication (`*`) is performed before Addition (`+`).
*Calculation: $10 + (3 * 2) = 10 + 6 = 16$*

```java
int x = 10 + 3 * 2;
System.out.println(x);
```

```
16
```

-----

**Example 2: Parentheses Override**

Parentheses (`()`) force the addition to happen first, overriding the standard order.
*Calculation: $(10 + 3) * 2 = 13 * 2 = 26$*

```java
int x = (10 + 3) * 2;
System.out.println(x);
```

```
26
```