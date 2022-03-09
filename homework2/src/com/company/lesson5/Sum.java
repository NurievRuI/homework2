package com.company.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) {

        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int sum = 0;
            String aStr = null;
            for (; ; ) {
                try {
                    aStr = bufferedReader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                    if (aStr.equals("сумма")) {
                        System.out.println(sum);
                        break;
                    } else {
                        int a = Integer.parseInt(aStr);
                        sum = sum + a;
                    }
                }
            }

        }
    }

