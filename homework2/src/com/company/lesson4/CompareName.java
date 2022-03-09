package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareName {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = null;
        String s2 = null;

        {
            try {
                s1 = bufferedReader.readLine();
                s2 = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (s1.intern() == s2.intern()) {
            System.out.println("Имена идентичны");
        } else if (s1.length() == s2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}