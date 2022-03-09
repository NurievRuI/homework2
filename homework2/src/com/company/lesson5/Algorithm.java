package com.company.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        try {
            maximum = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (maximum <= 0)
        {
            System.out.println("Error");
            return;
        }
        else
        {
            int result;
            int numbers[] = new int[maximum];

            for (int i =0; i < maximum; i++)
            {
                try {
                    numbers[i] = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            result = numbers[0];

            for (int i =1; i < maximum; i++)
            {
                result = max(numbers[i], result);
            }
            System.out.println(result);
        }

    }

    public static int max(int a, int b)
    {
        return a > b? a: b;
    }
}
