package com.anthony;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Phone calls from three different countries are c1, c2 and c3 standard units per minute.\nTalks continued t1, t2 and t3 minutes. \nLet`s find out how much computer will count for each call separately and all talk together?");

        recur();

    }
    public static void recur(){
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter countries c1 standard units per minute");
            float c1 = scan.nextFloat();

            System.out.println("Enter countries c2 standard units per minute");
            float c2 = scan.nextFloat();

            System.out.println("Enter countries c3 standard units per minute");
            float c3 = scan.nextFloat();

            System.out.println("Enter how long talk continued t1(minutes)");
            float t1 = scan.nextFloat();

            System.out.println("Enter how long talk continued t2(minutes)");
            float t2 = scan.nextFloat();

            System.out.println("Enter how long talk continued t3(minutes)");
            float t3 = scan.nextFloat();

            float ct11 = c1 * t1;
            float ct12 = c1 * t2;
            float ct13 = c1 * t3;
            float ct21 = c2 * t1;
            float ct22 = c2 * t2;
            float ct23 = c2 * t3;
            float ct31 = c3 * t1;
            float ct32 = c3 * t2;
            float ct33 = c3 * t3;

            float sum = ct11 + ct12 + ct13 + ct21 + ct22 + ct23 + ct31 + ct32 + ct33;

            System.out.println("Cost of a call in country c1 duration t1 minutes  = " + ct11);
            System.out.println("Cost of a call in country c1 duration t2 minutes  = " + ct12);
            System.out.println("Cost of a call in country c1 duration t3 minutes  = " + ct13);
            System.out.println("Cost of a call in country c2 duration t1 minutes  = " + ct21);
            System.out.println("Cost of a call in country c2 duration t2 minutes  = " + ct22);
            System.out.println("Cost of a call in country c2 duration t3 minutes  = " + ct23);
            System.out.println("Cost of a call in country c3 duration t1 minutes  = " + ct31);
            System.out.println("Cost of a call in country c3 duration t2 minutes  = " + ct32);
            System.out.println("Cost of a call in country c3 duration t3 minutes  = " + ct33);
            System.out.println("\n\tCost for all calls   = " + sum);
        }
        catch(Exception e){
            System.out.println("Try enter number");
            recur();
        }
    }
}