package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner rs = new Scanner(System.in);
        String s = rs.nextLine();
        int i = rs.nextInt();
        int x = 0;
        while (x < i) {
            System.out.println(s);
            x++;
        }

    }
}
