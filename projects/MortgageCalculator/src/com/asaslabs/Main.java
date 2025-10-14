package com.asaslabs;

public class Main {
    public static void main(String[] args) {
        var reader = new ConsoleReader();
        int principal = reader.readPrincipal();
        float annualInterest = reader.readAnnualInterest();
        byte years = reader.readPeriod();

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
    }
}