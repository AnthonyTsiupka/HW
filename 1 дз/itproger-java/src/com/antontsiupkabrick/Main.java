package com.antontsiupkabrick;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.println("Hi, " + username + " :)");
        System.out.println("What is your surname?");
        String usersurname = scan.nextLine();
        System.out.println(usersurname + "?" + "What the stupid surname?");
        System.out.println("It does not matter, " + username + "." + "Do you want to know if a rectangular brick will fit into a rectangular slot?");
        System.out.println("(If you want enter 'yes', if you do not want enter 'no')");
        String yesorno ;

        do
        {
            yesorno = scan.nextLine();
            if (yesorno.equals("no") || yesorno.equals("No")) {
                System.out.println("I don't give a fuck");
                break;
            } else if (yesorno.equals("yes") || yesorno.equals("Yes")) {
                System.out.println("Good choice, " + username + "! Let`s try");
               break;
            }

            else{
                System.out.println("Do you stupid, " + username + "? If you want enter 'yes', if you do not want enter 'no'");
            }
        }
        while (!yesorno.equals("no") || !yesorno.equals("No") || !yesorno.equals("Yes") || !yesorno.equals("yes"));

        recur();

    }
    public static void recur(){
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter brick length (centimeters)");
            float length1 = scan.nextFloat();

            System.out.println("Enter brick height (centimeters)");
            float height1 = scan.nextFloat();

            System.out.println("Enter brick width (centimeters)");
            float width1 = scan.nextFloat();

            System.out.println("Enter slot height (centimeters)");
            float height2 = scan.nextFloat();

            System.out.println("Enter slot width (centimeters)");
            float width2 = scan.nextFloat();

            if (height1 == height2 && width1 == width2) {
                System.out.println("Yes, with these parameters, a rectangular brick will fit into a rectangular slot");
            } else if (height1 == width2 && width1 == height2) {
                System.out.println("Yes, with these parameters, a rectangular brick will fit into a rectangular slot");
            } else if (length1 == height2 && height1 == width2) {
                System.out.println("Yes, with these parameters, a rectangular brick will fit into a rectangular slot");
            } else if (length1 == width2 && height1 == height2) {
                System.out.println("Yes, with these parameters, a rectangular brick will fit into a rectangular slot");
            } else if (length1 == height2 && width1 == width2) {
                System.out.println("Yes, with these parameters, a rectangular brick will fit into a rectangular slot");
            } else if (length1 == width2 && width1 == height2) {
                System.out.println("Yes, with these parameters, a rectangular brick will fit into a rectangular slot");
            } else {
                System.out.println("No, with these parameters, a rectangular brick will not fit into a rectangular slot");
            }
        }
        catch(Exception e){
            System.out.println("Try enter number");
            recur();
        }
    }
}