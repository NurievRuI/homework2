package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = null;
        String s2 = null;
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

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        for (int i = 0; i < i1; i++) {
            for (int j = 0; j < i2; j++) {
                System.out.print(8);
                if (j == i2 - 1) {
                    System.out.println();
                }
            }
        }
    }
}
