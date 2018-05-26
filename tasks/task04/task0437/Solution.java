package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/



public class Solution {
    public static void main(String[] args) throws Exception {
        int x = 8;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               if(j<=i) System.out.print(x);
            }
            System.out.println("");
        }

    }
}
