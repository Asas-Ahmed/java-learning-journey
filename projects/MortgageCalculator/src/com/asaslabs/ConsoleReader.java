package com.asaslabs;

import java.util.Scanner;

public class ConsoleReader {
    private static final int MIN_PRINCIPAL = 1_000;
    private static final int MAX_PRINCIPAL = 1_000_000;
    private static final float MIN_INTEREST = 0.0f;
    private static final float MAX_INTEREST = 30.0f;
    private static final byte MIN_YEARS = 1;
    private static final byte MAX_YEARS = 30;

    private Scanner scanner = new Scanner(System.in);

    public int readPrincipal() {
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= MIN_PRINCIPAL && value <= MAX_PRINCIPAL)
                    return value;
            } else {
                scanner.next();
            }
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }
    }

    public float readAnnualInterest() {
        while (true) {
            System.out.print("Annual Interest Rate: ");
            if (scanner.hasNextFloat()) {
                float value = scanner.nextFloat();
                if (value > MIN_INTEREST && value <= MAX_INTEREST)
                    return value;
            } else {
                scanner.next();
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
    }

    public byte readPeriod() {
        while (true) {
            System.out.print("Period (Years 1 - 30): ");
            if (scanner.hasNextByte()) {
                byte value = scanner.nextByte();
                if (value >= MIN_YEARS && value <= MAX_YEARS)
                    return value;
            } else {
                scanner.next();
            }
            System.out.println("Enter a value between 1 and 30");
        }
    }
}
