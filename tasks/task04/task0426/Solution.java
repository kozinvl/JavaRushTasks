package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if  (n % 2 == 0) {
            if (n > 0) {
                System.out.println("положительное четное число");
            }else if (n < 0) {
                System.out.println("отрицательное четное число");

            }
            if (n == 0) System.out.println("ноль");
        }
        if (n%2 != 0) {
            if (n < 0) {
                System.out.println("отрицательное нечетное число");
            } else {
                System.out.println("положительное нечетное число");
            }
        }
    }
}
