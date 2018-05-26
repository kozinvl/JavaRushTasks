package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
           public static void main (String[]args) throws Exception {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            double t = Double.parseDouble(buf.readLine());
            double г = t % 5;
            if (г < 3) {
                System.out.println("зелёный");
            } else if (г < 4) {
                System.out.println("желтый");
            } else System.out.println("красный");
        }
    }
