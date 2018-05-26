package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> snachalo = new ArrayList<>();
        BufferedReader sp = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10 ; i++) {
            snachalo.add(0, sp.readLine() );

        }
        for (int i = 0; i < snachalo.size() ; i++) {
            System.out.println(snachalo.get(i));

        }
    }
}
