// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package com.codewithsepti;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
//      mortgageChallenge();
        fizzBuzzChallenge();
    }
    public static void mortgageChallenge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Annual interest rate (%): ");
        double interestRate = Double.parseDouble(scanner.nextLine().trim()) / 100;

        System.out.print("Period (years): ");
        int period = Integer.parseInt(scanner.nextLine().trim());

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print("Mortgage: " + currency.format(getMortgage(principal, interestRate, period)));
    }

    public static double getMortgage(int principal, double interestRate, int period) {
        double monthlyInterestRate = interestRate / 12;
        int periodMonths = period * 12;
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, periodMonths )) / (Math.pow(1 + monthlyInterestRate, periodMonths ) - 1);

    }

    public static void fizzBuzzChallenge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("FizzBuzz up to: ");
        int fizzBuzzLimit = Integer.parseInt(scanner.nextLine().trim());


        for (int i = 1; i <= fizzBuzzLimit; i++) {
            String output = "";
            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";

            if (output.isEmpty()) output += Integer.toString(i);

            System.out.println(output);
        }
    }

}