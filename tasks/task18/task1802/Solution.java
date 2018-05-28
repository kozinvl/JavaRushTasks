package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        FileInputStream x = new FileInputStream(line);
        int min = x.read();


        while (x.available() > 0) {
            int data = x.read();
            if (data < min) min = data;

        }
        x.close();
        System.out.println(min);
    }
}
