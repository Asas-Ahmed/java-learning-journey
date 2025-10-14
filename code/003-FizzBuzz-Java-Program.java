/*
 * Title: FizzBuzz Java Program
 *
 * Question:
 * Write a Java program that:
 * - Asks the user to input a number.
 * - Prints:
 *   - "FizzBuzz" if the number is divisible by both 3 and 5,
 *   - "Buzz" if it's divisible by 5 only,
 *   - "Fizz" if it's divisible by 3 only,
 *   - Otherwise, prints the number itself.
 *
 * Use if-else statements and the modulo operator (%) to check for divisibility.
 */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int num = scanner.nextInt();
        int result = 0;

        if ((num % 3 == result) && (num % 5 == result))
            System.out.println("FizzBuzz");
        else if (num % 5 == result)
            System.out.println("Buzz");
        else if (num % 3 == result)
            System.out.println("Fizz");
        else
            System.out.println(num);
    }
}
