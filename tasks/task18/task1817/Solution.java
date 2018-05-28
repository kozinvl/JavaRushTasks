package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream input = new FileInputStream(args[0]);
        double spaceCount = 0;
        double charCount = 0;
        while (input.available() > 0) {
            if (input.read() == 32)
                spaceCount++;
             charCount++;
        }
        double result = (spaceCount / charCount) * 100;
        System.out.println(String.format("%.2f", result));
        input.close();
    }
}
