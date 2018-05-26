package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader readOn = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            int a = Integer.parseInt(readOn.readLine());
            list.add(a);
        }
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (Integer aList : list)
        {
            if ((aList % 3 == 0))
                list1.add(aList);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (Integer aList : list)
        {
            if ((aList % 2 == 0))
                list2.add(aList);
        }
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (Integer aList : list)
        {
            if ((aList % 3 != 0) & (aList % 2 != 0))
                list3.add(aList);
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        for (Integer aList : list)
        {
            System.out.println(aList);
        }
    }
}


