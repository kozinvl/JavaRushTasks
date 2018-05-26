package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());

        }//напишите тут ваш код

        int z = 0;
        for (int i = 1; i < list.size(); i++) {

            if (list.get(i - 1).length() > list.get(i).length()) {
                z = list.get(i - 1).length();
                list.remove(i);
            } else if (list.get(i - 1).length() < list.get(i).length()) {
                z = list.get(i).length();
                list.remove(i - 1);
            }

        }
        for (int i = 0; i < list.size(); i++) {
            if (z == list.get(i).length())
                System.out.println(list.get(i));
        }
    }
}
