package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] arr = new int [20];
        int [] small = new int [10];
        int [] small2 = new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < 10; i++ ){
            small[i] = arr[i];
        }
        for (int i = 0; i < 10; i++ ){
           small2[i] = arr[i+10];
        }

        for (int i = 0; i < 10; i++){
            System.out.println(small2[i]);
        }
    }
}
