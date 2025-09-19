
---

# Casting

---

* **Implicit Casting (Widening / Auto)**
  Small → Big type (no data loss).
  `byte → short → int → long → float → double`

* **Explicit Casting (Narrowing / Manual)**
  Big → Small type (may lose data).
  Example: `(int) 1.9 → 1`

* **Parsing Strings**

  * `Integer.parseInt("1") → 1`
  * `Double.parseDouble("1.1") → 1.1`
<br><br>
>✅ Use **implicit** when going *up* in type.
>
>✅ Use **explicit** when going *down*.
>
>✅ Use **parse** when converting `String → number`.

---

```java
// Implicit Casting / Automatic Conversion
// byte > short > int > long > float > double
short x = 1;
int y = x + 2;
System.out.println(y);
```
```
3
```

```java
double x = 1.1;
double y = x + 2; // 2.0
System.out.println(y);
```
```
3.1
```

```java
double x = 1.1;
int y = (int)x + 2; // Explicit Casting
System.out.println(y);
```
```
3
```

```java
String x = "1";
int y = (Integer.parseInt(x)) + 2;
System.out.println(y);
```
```
3
```

```java
String x = "1.1";
double y = (Double.parseDouble(x)) + 2;
System.out.println(y);
```
```
3.1
```