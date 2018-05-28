package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }



        @Override
        public Person read() throws IOException {
            Person person = null;
            if(fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String [] parts = line.split(" ");
                String last = parts[0];
                String first = parts[1];
                String mid = parts[2];
            Calendar calendar = new GregorianCalendar(Integer.parseInt(parts[5]),  Integer.parseInt(parts[4]) - 1, Integer.parseInt(parts[3]));

                person = new Person(first, mid, last, calendar.getTime());
            }


            return  person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
