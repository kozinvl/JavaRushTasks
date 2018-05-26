package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map =  new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Herov", "Her");
        map.put("Dul'kin", "Dula");
        map.put("Petin", "Afanasiy");
        map.put("Sidorov", "Semen");
        map.put("Pen", "Semen");
        map.put("Nosin", "Napoleon");
        map.put("PUtin", "Semen");
        map.put("Cherezzabornogyzaderi", "Petr");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
       int count = 0;
       for(Map.Entry<String, String> txt: map.entrySet()){
                if(txt.getValue().equals(name))
                    count++;
       }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count =0;
        for (Map.Entry<String,String> pair: map.entrySet())
        {
            if (pair.getKey().equals(lastName))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
