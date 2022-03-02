package com.company.lesson2;

public class Output {
    public static void main(String[] args) {
        //Вывод текста на экран
        //
        //Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке. Слова должны быть разделены пробелом и не должны сливаться в одно.

        String s = "fsdf";
        out(s);
    }
    public static void out(String s) {
        for (int i = 0; i < 3; i++) {
            System.out.print(s);
            System.out.print(" ");
        }
    }
}
