package com.anthony;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog ("John", "breed1", 1);
        String res1 = dog1.getValues();
        System.out.println(res1);

        Dog dog2 = new Dog ("Bim", "breed2", 2);
        String res2 = dog2.getValues();
        System.out.println(res2);

        Dog dog3 = new Dog ("Bob", "breed3", 3);
        String res3 = dog3.getValues();
        System.out.println(res3);

        int[] ageDog = new int[3];
        ageDog[0] = dog1.age;
        ageDog[1] = dog2.age;
        ageDog[2] = dog3.age;

        int max = ageDog[0];
        for (int i = 0; i < ageDog.length; i++) {
            if (ageDog[i] > max) {
                max = ageDog[i];
            }
        }
        if(max == ageDog[0]) {
            System.out.println("The oldest dog: " + dog1.name + " " + max + " y.o.");
        } else if(max == ageDog[1]) {
            System.out.println("The oldest dog: " + dog2.name + " " + max + " y.o.");
        } else if(max == ageDog[2]) {
            System.out.println("The oldest dog: " + dog3.name + " " + max + " y.o.");
        }

        String[] nameDog = new String[3];
        nameDog[0] = dog1.name;
        nameDog[1] = dog2.name;
        nameDog[2] = dog3.name;

        if(nameDog[0].equals(nameDog[1]) || nameDog[0].equals(nameDog[2]) || nameDog[1].equals(nameDog[2])) {
            System.out.println("There is two dogs with the same name");
        } else {
            System.out.println("There is no two dogs with the same name");
        }
    }
}
