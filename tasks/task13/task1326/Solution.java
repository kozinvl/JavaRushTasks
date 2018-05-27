package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;

public class Solution {
    public static void main(String[] args)  throws IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String FileName = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader input = new BufferedReader(new FileReader(FileName));

        while (input.ready()) {
            int number = Integer.parseInt(reader.readLine());
            if (number % 2 == 0 ) {list.add(number);}
        }
        Collections.sort(list);

        for (Integer integer : list) {

            System.out.println(integer);

        }


    }
}
