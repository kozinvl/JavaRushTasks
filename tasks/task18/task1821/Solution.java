package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        TreeMap<Character, Integer> list = new TreeMap<>();
        FileInputStream in = new FileInputStream(args[0]);
        while (in.available() > 0) {
            int x = (char) in.read();
            char ch = (char) x;
            if (!list.containsKey(ch)) {
                list.put(ch, 1);

            } else list.put(ch, list.get(ch) + 1);

        }
        for (Map.Entry<Character, Integer> pair : list.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        in.close();

    }
}
