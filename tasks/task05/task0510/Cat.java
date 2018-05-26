package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
   String name = null;
   int age = 1;
   int  weight = 15;
   String address = null;
   String color = "Vaskya";

   public void initialize(String name){
       this.name = name;
       this.age = age ;
       this.weight = weight;
       this.color = color;
   }
    public void initialize(String name, int  weight,  int age ) {
        this.name = name;
        this.age = age ;
        this.weight = weight;
        this.color = color;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age ;
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int  weight, String color){
        this.age = age ;
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int  weight, String color, String address){
        this.age = age ;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
