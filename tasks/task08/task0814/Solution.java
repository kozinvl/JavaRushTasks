package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Iterator;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
       HashSet<Integer> set = new HashSet<>();
        Random c = new Random();
        for (int i = 0; i < 20 ; i++) {
            set.add(c.nextInt());

        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer a = iterator.next();
            if (a>10)
                iterator.remove();
        }
        return set;

    }

    public static void main(String[] args) {
        HashSet<Integer> set = createSet();
        set = removeAllNumbersMoreThan10(set);
    }


}
