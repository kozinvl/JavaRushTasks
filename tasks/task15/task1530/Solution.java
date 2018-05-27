package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        TeaMaker r = new TeaMaker();
        LatteMaker l = new LatteMaker();
        l.makeDrink();
        r.makeDrink();

    }
}
