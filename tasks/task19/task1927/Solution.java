package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStrean = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(out);
        System.setOut(stream);
        testString.printSomething();
        String result = out.toString();
        System.setOut(consoleStrean);
        String [] print = result.split("\n");
        for (int i = 0; i < print.length; i++) {
            System.out.println(i);
            if(i%2 != 0) {
                System.out.println(print[i]);
                System.out.println("JavaRush - курсы Java онлайн");
            }
            else
                System.out.println(print[i]);
        }
        consoleStrean.close();
        stream.close();







    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
