package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = null;
        try {
            int sum = 0;
            while (true) {
                s1 = bufferedReader.readLine();
                int i1 = Integer.parseInt(s1);
                sum += i1;

                if (i1 == -1) {
                    System.out.println(sum);
                    break;
                }
            }
        } catch (IOException e )   {
            e.printStackTrace();
        }
    }
}
