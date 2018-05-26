package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {

        ArrayList <String> [] list = new ArrayList[3];
        String s = "AllaBababah";
        ArrayList<String> l1 = new ArrayList<>();
        l1.add(s);
        ArrayList<String> l2 = new ArrayList<>();
        l2.add(s);
        ArrayList<String> l3 = new ArrayList<>();
        l3.add(s);
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;


        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}