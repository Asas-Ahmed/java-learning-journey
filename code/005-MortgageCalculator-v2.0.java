package com.asaslabs;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = readPrincipal(scanner);
        float annualInterest = readAnnualInterest(scanner);
        byte years = readPeriod(scanner);

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String formattedMortgage = formatCurrency(mortgage);

        System.out.println("\nMortgage: " + formattedMortgage);

        scanner.close();
    }

    private static int readPrincipal(Scanner scanner) {
        final int MIN_PRINCIPAL = 1_000;
        final int MAX_PRINCIPAL = 1_000_000;

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= MIN_PRINCIPAL && value <= MAX_PRINCIPAL)
                    return value;
            } else {
                scanner.next(); // consume invalid input
            }
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }
    }

    private static float readAnnualInterest(Scanner scanner) {
        final float MIN_INTEREST = 0.0f;
        final float MAX_INTEREST = 30.0f;

        while (true) {
            System.out.print("Annual Interest Rate: ");
            if (scanner.hasNextFloat()) {
                float value = scanner.nextFloat();
                if (value > MIN_INTEREST && value <= MAX_INTEREST)
                    return value;
            } else {
                scanner.next(); // consume invalid input
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
    }

    private static byte readPeriod(Scanner scanner) {
        final byte MIN_YEARS = 1;
        final byte MAX_YEARS = 30;

        while (true) {
            System.out.print("Period (Years 1 - 30): ");
            if (scanner.hasNextByte()) {
                byte value = scanner.nextByte();
                if (value >= MIN_YEARS && value <= MAX_YEARS)
                    return value;
            } else {
                scanner.next(); // consume invalid input
            }
            System.out.println("Enter a value between 1 and 30");
        }
    }

    private static double calculateMortgage(int principal, float annualInterest, byte years) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    private static String formatCurrency(double value) {
        return NumberFormat.getCurrencyInstance().format(value);
    }
}
