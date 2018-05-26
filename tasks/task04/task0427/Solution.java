package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

                 Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int a = Integer.parseInt(s);
            if (a >= 1 && a <= 999 && a % 2 == 0) {
                if (s.length() == 1) {
                    System.out.println("четное однозначное число");
                }
                if (s.length() == 2) {
                    System.out.println("четное двузначное число");
                }
                if (s.length() == 3) {
                    System.out.println("четное трехзначное число");
                }
            } else if (a >= 1 && a <= 999 && a % 2 != 0) {
                if (s.length() == 1) {
                    System.out.println("нечетное однозначное число");
                }
                if (s.length() == 2) {
                    System.out.println("нечетное двузначное число");
                }
                if (s.length() == 3) {
                    System.out.println("нечетное трехзначное число");
                }
            }

        }

    }

