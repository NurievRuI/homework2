package com.company.lesson4;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T18 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = null;
        String s2 = null;
        try {
            s1 = bufferedReader.readLine();
            s2 = bufferedReader.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int i1 = Integer.parseInt(s2);

        if (i1 < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
