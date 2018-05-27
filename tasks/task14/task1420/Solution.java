package com.javarush.task.task14.task1420;

/* 
НОД
*/

import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int x = 0;   int x2 = 0;

        try {
            x = Integer.parseInt(num1);
            if ( x <= 0) throw new Exception();
        } catch (Exception e) {
            throw e;
        }
        try {
            x2 = Integer.parseInt(num2);
            if (x2 <=0) throw new Exception();
        } catch (Exception e) {
            throw e;
        }

        System.out.println(evclid(x , x2));
    }

    private static int evclid(int x, int x2) {
        if (x2 == 0 ) {
            return x;
        }
        return evclid(x2,  x % x2);

            
        }
    }

