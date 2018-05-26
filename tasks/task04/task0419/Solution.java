package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/
import java.util.Scanner;
import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        scan.close();
        System.out.println(max(a, b, c, d));
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}
