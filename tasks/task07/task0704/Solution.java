package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] mass = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<mass.length; i++) {
            mass[i] = scan.nextInt();

        }

           for(int j = 9; j >= 0; j--)
            {
                System.out.println(mass[j]);
            }




        }
    }


