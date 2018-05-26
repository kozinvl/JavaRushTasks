package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>();
        BufferedReader rc = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
            list.add(i, rc.readLine());
        }

            int min = Integer.MAX_VALUE;;
            for (int j = 0; j<list.size() ; j++) {
                if(min > list.get(j).length()) {
                    min = list.get(j).length(); }
            }
                for (int k = 0; k < list.size() ; k++) {
                    if (min == list.get(k).length()) {
                        System.out.println(list.get(k));
                    }
              }


    }
}
