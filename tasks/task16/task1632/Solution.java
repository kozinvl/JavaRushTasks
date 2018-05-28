package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                while (true)
                    Thread.sleep(10000000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }

    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {

                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }


    public static class Thread4 extends Thread implements Message {

        private boolean live;

        @Override
        public void run() {
            while (live == false) {
            }
        }


        @Override
        public void showWarning() {
            live = true;
        }
    }


    public static void main(String[] args) {
        for (Thread s : threads) {
            s.start();
        }

    }

    private static class Thread5 extends Thread {
        String s;
        int sum = 0;

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                while (!(s = reader.readLine()).equals("N")) {
                    sum += Integer.parseInt(s);
                }
                System.out.println(sum);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}