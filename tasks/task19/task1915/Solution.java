package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream  stream = new PrintStream(out);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        FileOutputStream outputStream = new FileOutputStream(line);
        out.writeTo(outputStream);
        System.out.println(out.toString());


    outputStream.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

