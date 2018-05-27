package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
       labels.put(5D, "d");
       labels.put(56565D, "dd");
        labels.put(5656d,"dwdwd");
       labels.put(585d, "dd");
       labels.put(58744d, "ddddd");


    }




    public static void main(String[] args) {



        System.out.println(labels);
    }
}


