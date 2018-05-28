package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        FileOutputStream output = new FileOutputStream(s1);
        FileInputStream input = new FileInputStream(s2);
        FileInputStream input2 = new FileInputStream(s3);

        while (input.available() > 0) {
            int data = input.read();
            output.write(data);
        }
        while (input2.available() > 0) {
            int data = input2.read();
            output.write(data);
        }
        reader.close();
        output.close();
        input.close();
        input2.close();

    }
}
