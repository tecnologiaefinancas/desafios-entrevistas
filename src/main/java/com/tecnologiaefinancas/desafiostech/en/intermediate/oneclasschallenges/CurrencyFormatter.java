package com.tecnologiaefinancas.desafiostech.en.intermediate.oneclasschallenges;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    /*
    Here's an intermediate-level challenge that requires the use of NumberFormat and Locale.
    The goal is to format a given price in multiple currencies while ensuring correct locale-specific formatting.

    Challenge: Multi-Currency Price Formatter

    Problem Statement
    Create a Java program that:
    - Accepts a price value (double) from the user.
    - Formats the price for three different locales:
    - United States (USD)
    - Japan (JPY)
    - Germany (EUR)
    - Displays the formatted results.

    Constraints
    - The program must correctly format the currency according to locale-specific conventions.
    - You should use NumberFormat and Locale.
    - You can solve this using one or two classes.

     */

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre a price: ");
        Double insertedPrice = scanner.nextDouble();

        Locale usLocale = Locale.US;
        Locale japanLocale = Locale.JAPAN;
        Locale germanyLocale = Locale.GERMANY;

        // Format currency according to locale
        String usPrice = NumberFormat.getCurrencyInstance(usLocale).format(insertedPrice);
        String japanPrice = NumberFormat.getCurrencyInstance(japanLocale).format(insertedPrice);
        String germanyPrice = NumberFormat.getCurrencyInstance(germanyLocale).format(insertedPrice);

        System.out.println("USA price: " + usPrice + "\n" +
                "Japan price: " + japanPrice + "\n" +
                "Germany price: " + germanyPrice);
    }
}
