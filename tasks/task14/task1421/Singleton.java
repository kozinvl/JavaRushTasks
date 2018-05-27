package com.javarush.task.task14.task1421;

/**
 * Created by expertvl on 11.09.2017.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton () {}


    public static Singleton getInstance() {
            if(instance == null) {
                instance = new Singleton();
            }
        return instance;
    }


}
