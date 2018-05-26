package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int z = 0, y = 0;

        if (a >= 0 && b >= 0 && c >= 0) {

        }
        if (a > 0) {
            z++;
        } else if (a < 0) {
            y++;
        }
        if (b > 0) {
            z++;
        } else if (b < 0) {
            y++;

        }
        if (c > 0) {
            z++;
        } else if (c < 0) {
            y++;
        }
        System.out.println("количество отрицательных чисел: " + y);
        System.out.println("количество положительных чисел: " + z);

    }
}
