package com.asaslabs;

import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String formatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMortgage: " + formatted);
    }
}
