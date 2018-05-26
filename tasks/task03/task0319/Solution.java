package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String chislo1 = br.readLine();
        String chislo2 = br.readLine();


        System.out.println(name + " получает " + chislo1 +  " через " + chislo2 +  " лет.");
    }
}
