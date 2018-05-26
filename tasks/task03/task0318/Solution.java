package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tempAge = br.readLine();
        String name = br.readLine();
        int age = Integer.parseInt(tempAge);
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
