package com.knoldus;

import java.util.Scanner;

public class AppDriver {

    public static void main(String[] args) {
        System.out.println("==== Currency Converter ====");
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.displayCurrencies(currencyConverter.getCurrencies(), -1);
        System.out.println("Select currency to convert from: ");
        currencyConverter.setConvertFromIndex(scanner.nextInt());
        System.out.println();
        currencyConverter.displayCurrencies(currencyConverter.getCurrencies(), currencyConverter.getConvertFromIndex());
        System.out.println("Select currency to convert to: ");
        currencyConverter.setConvertToIndex(scanner.nextInt());
        double value = currencyConverter.convert(currencyConverter.getConvertFromIndex(),
                currencyConverter.getConvertToIndex());
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        double convertedAmount = value * amount ;
        System.out.println(amount + " " + currencyConverter.getCurrency(currencyConverter.getConvertFromIndex())
                + " = " + convertedAmount + " " + currencyConverter.getCurrency(currencyConverter.getConvertToIndex()));


    }
}
