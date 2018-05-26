package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat c1 = new Cat("vasya", 5 , 15 , 10);
        Cat c2 = new Cat("marko", 4 , 17 , 11);
        Cat c3 = new Cat("Senya", 1 , 16 , 12);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;

        }
    }
}