package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        if(b + c > a && a + b > c && a + c > b ){
            System.out.println("Треугольник существует.");
        } else System.out.println("Треугольник не существует.");

    }
}
