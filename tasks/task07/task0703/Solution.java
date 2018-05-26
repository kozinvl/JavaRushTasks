package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] mass1 = new String[10];
        int[] mass2 = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<mass1.length; i++)
            mass1[i] = scan.nextLine();
        for (int i=0; i<mass2.length; i++) {
            mass2[i] = mass1[i].length();
            System.out.println(mass2[i]);
        }
        }
    }

