
---

# **Logical Operators** 🧠

Logical Operators are used to **combine conditional statements** (conditions that result in True/False) to form more complex conditions.

| Operator | Meaning | Condition |
| :---: | :---: | :---: |
| **`&&`** (`and`) | Logical AND | True if **both** conditions are True. |
| **`||`** (`or`) | Logical OR | True if **at least one** condition is True. |
| **`!`** (`not`) | Logical NOT | **Reverses** the Boolean result. |

#### **Code Example 1: AND Operator**

Checks if the `temperature` is both greater than $20$ **AND** less than $30$.

```java
int temperature = 22;
boolean isWarm = temperature > 20 && temperature < 30; // 22 > 20 (T) && 22 < 30 (T)

System.out.println(isWarm);
```

**Output**

```
true
```

#### **Code Example 2: OR and NOT Operators**

Checks if the person is eligible: (has high income **OR** good credit) **AND** **NOT** having a criminal record.

```java
boolean hasHighIncome = false;
boolean hasGoodCredit = true;
boolean hasCriminalRecord = false;
boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
// (F || T) -> T
// !F -> T
// T && T -> True

System.out.println(isEligible);
```

**Output**

```
true
```

-----