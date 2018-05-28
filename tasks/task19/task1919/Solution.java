package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String line = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(line));
        Map<String, Double> map = new TreeMap<>();
        ArrayList<String> lines = new ArrayList<>();
        String stroka = null;
        while ((stroka = reader.readLine())!= null) {
            lines.add(stroka);
        }
        reader.close();
        ArrayList<String>keys = new ArrayList<>();
        ArrayList<Double> values = new ArrayList<>();
        String [] text;
        for (String s : lines) {
            text = s.split(" ");
            keys.add(text[0]);
            values.add(Double.parseDouble(text[1]));
        }
        for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
        }
        ArrayList <String> ignoredKeys = new ArrayList<>();
        for (int i = 0; i < keys.size(); i++) {
            for (int j = i+1; j < keys.size(); j++) {
                if(keys.get(i).equals(keys.get(j))&& !ignoredKeys.contains(keys.get(i))) {
                    Double tmp = values.get(i) + values.get(j);
                    map.put(keys.get(i),tmp);
                    ignoredKeys.add(keys.get(i));
                }

            }
        }
            for (Map.Entry<String, Double> pair : map.entrySet()) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }


    }
}
