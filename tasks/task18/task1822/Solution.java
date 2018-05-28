package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        while ( br1.ready()) {
            String s = br1.readLine();
            if(s.startsWith(args [0]))
                System.out.println(s);
        }
        br1.close();

    }
}
