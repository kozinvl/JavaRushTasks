package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());
        if (b == c && b != a) {
        System.out.println(1);
    }
        if (a == c && a != b) {
        System.out.println(2);
    }
        if (a == b && a != c) {
        System.out.println(3);
    }

}
}