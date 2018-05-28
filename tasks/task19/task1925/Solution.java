package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution {
    public static void main(String[] args) throws Exception {

        String line1 = args[0];
        String line2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(line1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(line2));
        StringBuffer out = new StringBuffer();
        while (reader.ready()) {
            String[] words = reader.readLine().split(" ");
            for (String word : words) {
                if (word.length() > 6)
                    out.append(word).append(",");
            }


        }

        out.delete(out.length()-1, out.length());
        writer.write(out.toString());
        reader.close();
        writer.close();

    }
}
