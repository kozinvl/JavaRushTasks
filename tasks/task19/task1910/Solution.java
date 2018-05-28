package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(line));
        BufferedWriter reader2 = new BufferedWriter(new FileWriter(line2));


        while (reader1.ready()) {
            String x = reader1.readLine().replaceAll("[\\p{Punct}\\n]", "");
            reader2.write(x);

        }
        reader1.close();
        reader2.close();

    }
}
