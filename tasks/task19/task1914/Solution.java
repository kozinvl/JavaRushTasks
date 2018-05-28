package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);
        testString.printSomething();
        String result = output.toString();
        String [] newresult = result.split(" ");
        int a = Integer.parseInt(newresult[0]);
        int b = Integer.parseInt(newresult[2]);
        System.setOut(consoleStream);
        int c = 0;
        if (newresult[1].equals("+")) {
            c = a + b;
        } else  if (newresult[1].equals("-")) {
            c = a - b;
        } else c = a*b;

        System.out.println(a+ " " + newresult[1] + " " + b + " = " + c);
        stream.close();
        consoleStream.close();







    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

