package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        ArrayList<String> list = new ArrayList<>();

        while (!(fileName = reader.readLine()).equals("end"))
            list.add(fileName);
        reader.close();

        Collections.sort(list);
        String [] stringArray = list.get(0).split(".part");
        String summaryFileName = stringArray[0];
        FileInputStream input;
        FileOutputStream out = new FileOutputStream(summaryFileName, true);
        byte[] buffer;

        for (String aList : list) {
            input = new FileInputStream(aList);
            buffer = new byte [input.available()];
            input.read(buffer);
            input.close();
            out.write(buffer);
        }
        out.close();

    }
}
