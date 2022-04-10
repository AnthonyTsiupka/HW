package com.anthony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Person obj1 = new Person("Anton", 2000);
        Person obj2 = new Person("Oleh", 2001);
        Person obj3 = new Person("Roman", 2002);
        Person obj4 = new Person("Denis", 2003);
        Person obj5 = new Person("Alex", 2004);

        Person[] people = new Person[5];
        for (int i = 0; i < 5; i++) {
            people[i] = Person.input();
        }

        for (Person person : people) {
            System.out.println(person.output());
        }

    }
}