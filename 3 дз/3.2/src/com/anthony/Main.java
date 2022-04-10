package com.anthony;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        recur();

    }
    public static void recur () {
        Scanner scan = new Scanner(System.in);
        try {
        System.out.println("What is your name?");
        String username = scan.nextLine();
        System.out.println("Hi, " + username + " :)");
        System.out.println("Where are you live(name)?");
        String address = scan.nextLine();
        System.out.println("So, you are live in " + address + "is it " + username + "?");
    }
        catch(Exception e){
        System.out.println("Try again");
        recur();
        }
    }

}

