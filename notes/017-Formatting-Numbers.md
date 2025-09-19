
---

# Formatting Numbers in Java

---

* **NumberFormat class** → Used to format numbers as **currency, percent, etc.**

---

### 1️⃣ Currency Format

```java
NumberFormat currency = NumberFormat.getCurrencyInstance();
String result = currency.format(1234567.891);
System.out.println(result); // → $1,234,567.89
```

* Adds **\$**, commas, and rounds to 2 decimal places.

---

### 2️⃣ Percent Format

```java
NumberFormat percent = NumberFormat.getPercentInstance();
String result = percent.format(0.1);
System.out.println(result); // → 10%
```

* Converts `0.1` → `10%` automatically.

* Shortcut (one line):

```java
String result = NumberFormat.getPercentInstance().format(0.1);
System.out.println(result); // → 10%
```

---

✅ Key Points:

* `NumberFormat.getCurrencyInstance()` → formats as money.
* `NumberFormat.getPercentInstance()` → formats as percent.
* `format()` method → **converts number to formatted string**.