package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> zChild = new ArrayList<Human>();
        Human child1 = new Human("Вася", true, 10, zChild);
        Human child2 = new Human("Вася", true, 10, zChild);
        Human child3 = new Human("Вася", true, 15, zChild);
        ArrayList<Human> xChild = new ArrayList<>();
        xChild.add(child1);
        xChild.add(child2);
        xChild.add(child3);
        Human father = new Human ("Михаил", true, 30, xChild);
        Human mother = new Human ("Раиса", false, 28, xChild);
        ArrayList<Human> yChildren1 = new ArrayList<Human>();
        ArrayList<Human> yChildren2 = new ArrayList<Human>();
        yChildren1.add(father);
        yChildren2.add(mother);
        Human grandFather1 = new Human ("Виктор", true, 60, yChildren1);
        Human grandMother1 = new Human ("Евгения", false, 57, yChildren1);
        Human grandFather2 = new Human ("Геннадий", true, 56, yChildren2);
        Human grandMother2 = new Human ("Наталия", false, 54, yChildren2);

        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());


    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
