package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        int tmp = 0;

        while (input.available() > 0) {
            int simvol = input.read();

            if (simvol == (byte) ',') {
                tmp++;
            }


        }

        System.out.println(tmp);
        reader.close();
        input.close();
    }
}
