package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else if (name1.length()==name2.length())
            System.out.println("Длины имен равны");
    }
    }

