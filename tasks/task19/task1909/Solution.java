package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws  Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        BufferedReader filereader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));


        while (filereader.ready()) {
            String x = filereader.readLine().replaceAll("\\.", "\\!" );
            bufferedWriter.write(x);
        }
        reader.close();
filereader.close();
        bufferedWriter.close();



    }
}
