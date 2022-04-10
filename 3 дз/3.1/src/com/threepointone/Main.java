package com.threepointone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Flower bed is shaped like a circle. Lets calculate perimeter and area!");
        System.out.println("Enter the radius ");

        recur();
    }
        public static void recur () {
            Scanner scan = new Scanner(System.in);

            try {
                float radius = scan.nextFloat();


                double per = 2 * radius * Math.PI;
                double ar = Math.PI * (radius * radius);

                System.out.println("Perimeter: " + per);
                System.out.println("Area: " + ar);

            } catch (Exception e) {
                System.out.println("Try enter number");
                recur();
            }
        }

}

