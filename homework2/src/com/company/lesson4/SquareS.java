package com.company.lesson4;

import java.io.IOException;

public class SquareS {
    public static void main(String[] args)
    {
        int n = 1;
        int i;
        while (n < 11)
        {
            i = 1;
            while (i < 11)
            {
                System.out.print("S");
                i++;
            }

            n++;
            if (n <= 10)
                System.out.println();
        }
    }
}
