
---

# Arrays

---

```java
import java.util.Arrays;
```
```java
int[] numbers = new int[5];
numbers[0] = 1;
numbers[1] = 2;

System.out.println(Arrays.toString(numbers));
```
```
[1, 2, 0, 0, 0]
```

```java
int[] numbers = {2,3,5,1,4};
System.out.println(numbers.length);

System.out.println(Arrays.toString(numbers));
```
```
5
[2, 3, 5, 1, 4]
```

```java
int[] numbers = {2,3,5,1,4};
Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));
```
```
[1, 2, 3, 4, 5]
```