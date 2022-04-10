package com.anthony;


import java.util.Scanner;


public class Main  {

    public static void main(String[] args) {

        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value: ");
            int value = scanner.nextInt();
            arr[i] = value;


            float inc = value;
            for (int a = 0; a < arr.length; a++) {
                if (-5 < inc && inc < 5) {
                    System.out.println("This values belong to the range (-5 < ... < 5): ");

                    break;
                } else {
                    System.out.println("This values is not belong to the range (-5 < ... < 5)");
                }
                break;
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimal value: " + min);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value: " + max);
    }
    }

