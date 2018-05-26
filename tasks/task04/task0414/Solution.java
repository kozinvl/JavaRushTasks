package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int leapYear = 366;
        int commonYear = 365;
        if ((year % 400) == 0) {
            System.out.println("количество дней в году: " + leapYear);
        } else if ((year % 4) == 0 && (year % 100) != 0) {
            System.out.println("количество дней в году: " + leapYear);
        } else {
            System.out.println("количество дней в году: " + commonYear);
        }

    }
}
