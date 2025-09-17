
---

# Primitive vs Reference Type

---

- memory management
  
```java
byte x = 1;
byte y = x;
x = 2;
System.out.println(y);
```
```
1
```

```java
Point point1 = new Point(1, 1);
Point point2 = point1;
point1.x = 2;
System.out.println(point2);
```
```
java.awt.Point[x=2,y=1]
```

- **Reference types** are copied by the references, whereas **primitive types** are copied by their value and these values are completely independent of each other.