package com.anthony;

public class Dog {
    public String name;
    public String breed;
    public int age;

    public Dog (String name, String breed, int age){
        setValues(name, breed, age);
    }

    public void setValues(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getValues() {
        String info = "Name: " + name + "; Breed: " + breed + "; Age: " + age + ".";
        return info;
    }

}