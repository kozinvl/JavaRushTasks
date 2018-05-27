package com.javarush.task.task14.task1413;

/**
 * Created by expertvl on 10.09.2017.
 */
public class Monitor implements CompItem {
    Monitor monitor;

    @Override
    public String getName(){
        return this.getClass().getSimpleName();
    }
}
