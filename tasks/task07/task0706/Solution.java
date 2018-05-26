package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           int[] dom = new int[15];
           int sumCh = 0;
           int sumN = 0;

                for(int i=0;i<15;i++){
                    dom[i] = Integer.parseInt(reader.readLine());
                }
                for (int j=0;j<15;j++){
                    if(j%2==0){
                        sumCh+=dom[j];
                    }
                    else
                        sumN+=dom[j];

                }
                if(sumCh>sumN){
                    System.out.println("В домах с четными номерами проживает больше жителей.");
                }
                else
                    System.out.println("В домах с нечетными номерами проживает больше жителей.");
            }
        }


