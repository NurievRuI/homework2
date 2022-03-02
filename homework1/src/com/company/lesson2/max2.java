package com.company.lesson2;

public class max2 {
    public static void main(String[] args) {
        //Максимум двух чисел
        //
        //Написать функцию, которая вычисляет максимум из двух чисел.
        int a = 1;
        int b = 2;
        int res = max(a, b);
        System.out.println("maximum = " + res);
    }

    public static int max(int a, int b) {
        if (a > b){
            return a;
        } else return b;
    }
}
