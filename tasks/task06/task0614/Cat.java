package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList cats = new ArrayList(); // 1.

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i = 0; i < 10; i++){ //2. Создаем 10 котов
            Cat cat = new Cat();
            cats.add(cat); //2.добавляем каждого созданного кота в cats (Почему надо делать в методе main, я не понимаю, куда логичнее в конструктор эту строку запихнуть)
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++){ //3.
            System.out.println(cats.get(i));
        }
    }
}