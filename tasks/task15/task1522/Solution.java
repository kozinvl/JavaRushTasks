package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }



    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet()  {
        // implement step #5 here - реализуйте задание №5 тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            if (input.equals(Planet.SUN))
                thePlanet = Sun.getInstance();
            else if (input.equals(Planet.MOON))
                thePlanet = Moon.getInstance();
            else if (input.equals(Planet.EARTH))
                thePlanet = Earth.getInstance();
            else thePlanet = null;
        } catch (IOException ignored) {}



    }
}
