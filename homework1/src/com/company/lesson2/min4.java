package com.company.lesson2;

public class min4 {
    public static void main(String[] args) {
        //Минимум четырёх чисел
        //
        //Написать функцию, которая вычисляет минимум из четырёх чисел.
        //Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 1;
        int res = min2(a, b, c, d);
        System.out.println("minimum = " + res);
    }

    public static int min(int a, int b) {
        if (a > b){
            return b;
        }else return a;
    }

    public static int min2(int a, int b, int c, int d) {
        if (d > c) {
            if (min(a, b) > c) {
                return c;
            }else return min(a, b);
        }else return d;
    }
}
