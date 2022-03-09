package com.company.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTwo {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = null;
        String sb = null;
        try {
            sa = reader.readLine();
            sb = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
