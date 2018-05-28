package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file = null;

        while (true) {
            String s = reader.readLine();
            try {
                file = new FileInputStream(s);

            } catch (FileNotFoundException e) {
                System.out.println(s);
                reader.close();

                return;
            }

        }


    }

}
