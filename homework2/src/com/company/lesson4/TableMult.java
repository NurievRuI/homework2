package com.company.lesson4;

public class TableMult {
    public static void main(String[] args) {
        int i = 1, j;
        while (i <= 10) {
            j = 1;
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;


        }
    }
}
