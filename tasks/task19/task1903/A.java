package com.javarush.task.task19.task1903;

/**
 * Created by expertvl on 22.10.2017.
 */
public class A {
    public static void main(String[] args) {
        String x = 501234567+"";
        while (x.length() < 10) {
            x ="0" +  x;
        }
        System.out.println(x);
        System.out.println(x.length());
    }
}
