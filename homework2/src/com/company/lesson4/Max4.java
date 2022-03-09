package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max4 {
    public static void main(String[] args) {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;

        {
            try {
                s1 = bufferedReader.readLine();
                s2 = bufferedReader.readLine();
                s3 = bufferedReader.readLine();
                s4 = bufferedReader.readLine();

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
            int i3 = Integer.parseInt(s3);
            int i4 = Integer.parseInt(s4);

            if (i1 > i2 && i1 > i3 && i1 > i4) {
                System.out.println(i1);
            } else if (i2 > i1 && i2 > i3 && i2 > i4) {
                System.out.println(i2);
            } else if (i3 > i1 && i3 > i2 && i3 > i4) {
                System.out.println(i3);
            } else if (i4 > i1 && i4 > i2 && i4 > i3) System.out.println(i4);
        }
    }
}
