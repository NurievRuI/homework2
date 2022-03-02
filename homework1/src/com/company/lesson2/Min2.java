package com.company.lesson2;

public class Min2 {
    public static void main(String[] args) {
        //Минимум двух чисел
        //
        //Написать функцию, которая возвращает минимум из двух чисел.

        int a = 5;
        int b = 7;
        int m = min(a, b);
        System.out.println("Minimum is " + m);
    }
    public static int min(int a, int b) {
        if (a > b) {
            return b;
        } else return a;
    }
}

