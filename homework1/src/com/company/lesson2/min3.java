package com.company.lesson2;

public class min3 {
    public static void main(String[] args) {
        //Минимум трёх чисел
        //
        //Написать функцию, которая вычисляет минимум из трёх чисел.
        int a = 3;
        int b = 1;
        int c = 2;
        int res = min(a, b, c);

        System.out.println("minimum = " + res);
    }

    public static int min(int a, int b, int c) {
        if (a > b) {
            if (b > c) {
                return c;
            }else return b;
        }else   return a;
    }
}
