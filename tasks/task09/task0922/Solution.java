package com.javarush.task.task09.task0922;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("M/dd/yyyy");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
              try  {
                  Date inputDate = dateFormat.parse(r.readLine());
                  System.out.println(outputDateFormat.format(inputDate).toUpperCase());
              } catch (Exception e) {
                  e.printStackTrace();
              }





    }
}
