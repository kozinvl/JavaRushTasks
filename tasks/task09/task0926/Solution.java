package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int []> list = new ArrayList<int []>();

        Random rand = new Random();
        int [] x = new int [5];
        for (int i = 0; i <x.length ; i++) {
            x[i] = rand.nextInt(10000);
            list.add(x);
        }
        list.add(x);
        int [] y = new int [2];
        for (int i = 0; i < y.length ; i++) {
            y[i] = rand.nextInt(10000);
        }
        list.add(y);

        int [] z = new int[4];
        for (int i = 0; i <z.length ; i++) {
            z[i] = rand.nextInt(10000);
        }
        list.add(z);
        int [] h = new int[7];
        for (int i = 0; i <h.length ; i++) {
            h[i] = rand.nextInt(10000);
        }
    list.add(h);
        int [] f = new int[0];
        list.add(f);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
