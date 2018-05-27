package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(short m) {
        System.out.println("Объект short" + m);
    }
    public static void printMatrix(int m) {
        System.out.println("Объект int" + m);
    }
    public static void printMatrix(double m) {
        System.out.println("Объект double" + m);
    }
    public static void printMatrix(float m) {
        System.out.println("Объект float" + m);
    }
    public static void printMatrix(double m, int n) {
        System.out.println("Объект double&int" + m + n);
    }
    public static void printMatrix(double m, float n) {
        System.out.println("Объект double&float" + m + n);
    }
    public static void printMatrix(double m, String n) {
        System.out.println("Объект double&string" + m + n);
    }
    public static void printMatrix(float m, int n) {
        System.out.println("Объект float&int" + m + n);
    }






}
