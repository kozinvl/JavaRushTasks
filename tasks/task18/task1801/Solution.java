package com.javarush.task.task18.task1801;


import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner cs = new Scanner(System.in);

        FileInputStream fileInputStream = new FileInputStream(cs.nextLine());
        int max = 0;

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (data > max)
                max = data;

        }
        fileInputStream.close();
        System.out.println(max);

    }
}
