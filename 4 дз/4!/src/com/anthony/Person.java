package com.anthony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String Name;
    private int birthYear;
    public static int count = 0;

    public Person(){
        count++;
    }

    public Person(String Name, int birthYear)
    {
        this.Name = Name;
        this.birthYear = birthYear;
        count++;

    }
    public int getAge(){
        return 2022 - birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String Name() {
        return Name;
    }
    static Person input() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Person p = new Person();
        System.out.print("First name: ");
        p.setName(br.readLine());
        System.out.print("Birth year: ");
        p.setBirthYear(Integer.parseInt(br.readLine()));
        return p;
    }

    public String output() {
        return "Person{Name: " + Name + ", BirthYear: " + birthYear + "\n, Age: " + getAge();
    }

    void changeName(String n){
        Name = n;
    }



}
