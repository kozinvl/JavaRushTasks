package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        while (input.available() > 0) {
            int key = input.read();

            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, ++value);
            } else map.put(key, 1);
        }
        int tempValue = 2147483647;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (tempValue > pair.getValue()) {
                tempValue = pair.getValue();
            }



        }
        for (Map.Entry<Integer, Integer> pair2 : map.entrySet()) {
            if (pair2.getValue().equals(tempValue))

                System.out.print(pair2.getKey() + " ");



        }
        reader.close();
        input.close();

    }

}

