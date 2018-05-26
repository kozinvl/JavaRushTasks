package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator iter = cats.iterator();
        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());
        printCats(cats);

    }

    public static Set<Cat> createCats() {
      Set<Cat> cats = new HashSet<>();
        Cat cat = new Cat();  //создал объекты-котов
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cats.add(cat); // добавил объекты в множество
        cats.add(cat1);
        cats.add(cat2);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat p : cats)
            System.out.println(p);
    }

    public static class Cat{}
}
