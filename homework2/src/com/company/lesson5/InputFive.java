package com.company.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFive {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            c = Integer.parseInt(reader.readLine());
            d = Integer.parseInt(reader.readLine());
            e = Integer.parseInt(reader.readLine());
        } catch (IOException z) {
            z.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException z) {
                z.printStackTrace();
            }
        }

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e)
    {
        int result;

        if (a < b && a < c && a < d && a < e){
            result = a;
        }
        else if (b < a && b < c && b < d && b < e){
            result = b;
        }
        else if (c < a && c < b && c < d && c < e){
            result = c;
        }
        else if (d < a && d < b && d < c && d < e){
            result = d;
        }
        else {
            result = e;
        }

        return result;

    }

}
