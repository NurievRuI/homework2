package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort3 {
    public static void main(String[] args) {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String s1 = null;
    String s2 = null;
    String s3 = null;

        {
            try {
                s1 = bufferedReader.readLine();
                s2 = bufferedReader.readLine();
                s3 = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                int i3 = Integer.parseInt(s3);

                if (i1 > i2 && i1 > i3) {
                    System.out.print(i1);
                    if (i2 > i3) {
                        System.out.print(" " + i2 + " " + i3);
                    } else
                        System.out.print(" " + i3 + " "  + i2);
                } else if (i2 > i3 && i2 > i1) {
                    System.out.print(i2);
                    if (i3 > i1) {
                        System.out.print(" " + i3 + " "  + i1);
                    } else
                        System.out.print(" " + i1 + " "  + i3);
                } else if (i3 > i1 && i3 > i2) {
                    System.out.print(i3);
                    if (i1 > i2) {
                        System.out.print(" " + i1 + " "  + i2);
                    } else
                        System.out.print(" " + i2 + " "  + i1);
                }
            }
        }
    }
}
