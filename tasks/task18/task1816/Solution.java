package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream input = new FileInputStream(args[0]);
        String english = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] chars = english.toCharArray();
        int count = 0;
        while (input.available() > 0) {
            int data = input.read();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == data)
                    count++;

            }

        }

        System.out.println(count);
        input.close();
    }
}
