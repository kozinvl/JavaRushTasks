package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<Integer, Integer> list = new HashMap<Integer, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        while (fileInputStream.available() > 0) {
            int key = fileInputStream.read();
            if (list.containsKey(key)) {
                int value = list.get(key);
                list.put(key, ++value);
            }
            else list.put(key, 1);
        }
        int tempValue=0;
        for(Map.Entry<Integer, Integer> pair :list.entrySet()){
            if(tempValue < pair.getValue())
                tempValue = pair.getValue();
        }
        for(Map.Entry<Integer, Integer> pair : list.entrySet()) {
            if (pair.getValue() == tempValue)
                System.out.println(pair.getKey());
        }
        reader.close();
        fileInputStream.close();
    }
}
