package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        FileInputStream input = new FileInputStream(line);

        List<Integer> list = new ArrayList<>();


        while (input.available() > 0) {
            int data = input.read();
            list.add(data);
        }

        Collections.sort(list);


        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j--);
                }
            }
        }
        for (int integer : list) {
            System.out.print(integer + " ");

        }
        reader.close();
        input.close();


    }
}
