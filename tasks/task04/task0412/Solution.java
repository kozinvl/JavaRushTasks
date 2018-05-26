package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String num = r1.readLine();
        int a1 = Integer.parseInt(num);
        if (a1>0){
            System.out.println(a1*2);
        }
        else if (a1<0){
            System.out.println(a1+1);
        }
        else if(a1==0){
            System.out.println(0);
        }
    }

}