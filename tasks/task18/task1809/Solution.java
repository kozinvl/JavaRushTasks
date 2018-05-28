package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream in = new FileInputStream(fileName1);
        FileOutputStream out = new FileOutputStream(fileName2);


        byte[] buffer = new byte[in.available()];
            in.read(buffer);
        for (int i = buffer.length - 1; i >= 0; i--) {
            out.write(buffer[i]);
        }
        reader.close();
        in.close();
        out.close();


    }
}
