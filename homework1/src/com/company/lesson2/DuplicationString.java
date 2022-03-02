package com.company.lesson2;

public class DuplicationString {
    public static void main(String[] args) {
        //Дублирование строки
        //
        //Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
        String s = "fdsfd";
        dub(s);
    }

    public static void dub(String s){
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }
    }
}
