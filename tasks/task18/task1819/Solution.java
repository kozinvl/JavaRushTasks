package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        String line2 = reader.readLine();
        reader.close();
        FileInputStream in1 = new FileInputStream(line1);
        FileInputStream in2 = new FileInputStream(line2);
        byte[] byte1 = new byte[in1.available()];
        byte[] byte2 = new byte[in2.available()];
        in1.read(byte1);
        in2.read(byte2);

        FileOutputStream out = new FileOutputStream(line1, false);
        out.write(byte2);
        FileOutputStream out2 = new FileOutputStream(line2, true);
        out.write(byte1);
        in1.close();
        in2.close();
        out.close();


    }
}
