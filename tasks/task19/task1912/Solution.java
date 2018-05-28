package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;  //сохранили настоящий вывод в переменную
        ByteArrayOutputStream output = new ByteArrayOutputStream();  // создали динмаческий массив
        PrintStream stream = new PrintStream(output);   //создали адаптер к Print Stream
        System.setOut(stream); //установили как текущий system out
            testString.printSomething();

            System.setOut(consoleStream);
        System.out.println(output.toString().replaceAll("te", "??" ));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
