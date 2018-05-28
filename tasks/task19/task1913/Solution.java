package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        PrintStream consolestream = System.out;   //saving default output
        ByteArrayOutputStream output = new ByteArrayOutputStream(); //new object
        PrintStream stream = new PrintStream(output); //"wrapper decorator"
        System.setOut(stream); //changing not default output
        testString.printSomething(); //outputing in not original stream
        String result = output.toString(); //saving in a string variable
        String[] splits = result.split(""); // String was splitted and saved in [];
        for (String s : splits) {
            try {
                list.add(Integer.parseInt(s));
            } catch (Exception e) {
            }
        }
        System.setOut(consolestream);   //default output
        for (int i : list) {
            System.out.print(i);
        }

    }


    public static class TestString {
        public void printSomething() {

            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
