package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Сидоров", "Сидор");
        map.put("Федоров", "Сидор");
        map.put("Николаев", "Коляба");
        map.put("Егоров", "Жорик");
        map.put("Светка", "Чветка");
        map.put("Костин", "Костямба");
        map.put("Киров", "Кирюха");
        map.put("Стоянова", "Стоя");
        map.put("Петров", "Петруччо");
        map.put("Оля", "Коля");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet())
        {
            for (Map.Entry<String, String> s2 : copy.entrySet())
            {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey()))
                    removeItemFromMapByValue(map,s.getValue());
            }
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
