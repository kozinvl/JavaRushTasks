package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File myFile = new File(br.readLine());
        BufferedWriter bw = new BufferedWriter(new FileWriter(myFile));
        PrintWriter writer = new PrintWriter((bw));
        while (true) {
            String x = br.readLine();
            writer.println(x);
            if (x.equals("exit")) break;
        }
        writer.close();
        br.close();
        bw.close();
    }}