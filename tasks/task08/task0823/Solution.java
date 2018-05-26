package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        char[] stroka = s.toCharArray();
        stroka[0] = Character.toUpperCase(stroka[0]);
        for (int i = 0; i < stroka.length ; i++) {
                if(stroka[i]==' '){
                    if(stroka[i+1] != ' ')
                        stroka[i+1] = Character.toUpperCase(stroka[i+1]);
                }
        }
        for (char array: stroka)
            System.out.print(array);


    }
}
