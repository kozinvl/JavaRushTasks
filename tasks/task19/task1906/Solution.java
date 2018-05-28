package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();
        reader.close();
        FileReader file1 = new FileReader(line);
        FileWriter file2 = new FileWriter(line2);
        ArrayList<Integer> list = new ArrayList<>();


        while (file1.ready()) {
            int value = file1.read();
            list.add(value);
        }

        for (int i = 1; i < list.size(); i+=2) {
            file2.write((char)(int)list.get(i));
        }
file1.close();
        file2.close();



    }
}
