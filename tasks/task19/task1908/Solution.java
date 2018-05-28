package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();
        BufferedReader file = new BufferedReader(new FileReader(line));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(line2));

        while (file.ready()) {
            String x = file.readLine();
            String z[] = x.split(" ");

            for (String s : z) {
                try {
                    System.out.println(Integer.parseInt(s));
                    file2.write(s + " ");
                } catch (NumberFormatException e) {
                    continue;
                }

            }


        }
        reader.close();
        file.close();
        file2.close();


    }
}
