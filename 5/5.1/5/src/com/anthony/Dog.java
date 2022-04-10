package com.anthony;

public class Dog {
         public String name;
        public int age;
        public String breed;

         public void setValues(String name, int age, String breed) {
             this.name = name;
             this.age = age;
             this.breed = breed;
         }

             public String getValues() {
                 String info = "Name: " + name + "Name: " + "Breed: " + breed;
                 return info;
             }
         }



