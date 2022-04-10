package com.anthony;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        recur1();

    }

    public static void recur1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("let's find out is number 3 include in the square of the your number?");
        System.out.print("\n\nInput number: ");
        try {

            int number = sc.nextInt();
            int number1 = number * number;

            int digit = 3;
            while (number1 > 0) {
                int part = number1 % 10;
                if (part == digit) {
                    System.out.println("The number 3 is include in the square of the given number");
                    return;
                }
                number1 = (number1 - number1 % 10) / 10;
            }
            System.out.println("The number 3 is not include in the square of the given number");

            System.out.println("let's reorder the numbers in your number");
            int nu1 = number;
            nu1 = Integer.parseInt(new StringBuffer(String.valueOf(nu1)).reverse().toString());
            System.out.println("Result: " + nu1);

            System.out.println("Rearrange the first and last number of your number ");
            int nu2 = number;
            String text = String.valueOf(number);
            text = text.substring(text.length()-1)+text.substring(1, text.length()-1)+text.substring(0, 1);
            nu2 = Integer.parseInt(text);
            System.out.println("Result: " + nu2);

            int nu3 = number;
            System.out.println("Add one at the beginning and end of your number ");
            System.out.println("Result: " + "1" + nu3 + "1");



        } catch (Exception e) {
            System.out.println("Try again");
            recur1();
        }
    }
}


