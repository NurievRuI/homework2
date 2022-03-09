package com.company.TicTacToe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    final char X = 'x';
    final char O = 'o';
    final char EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {//конструктор
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    void game() {//логика
        initTable();
        while (true) {
            Human();
            if (checkWin(X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            AI();
            printTable();
            if (checkWin(O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printTable();
    }

    void initTable() {//инициализация таблицы
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                table[row][col] = EMPTY;
    }



    void printTable() { //вывод таблицы
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }

    void Human() { //ходит человек
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = X;
    }

    boolean isCellValid(int x, int y) { //проверка валидности хода
        if (x < 0 || y < 0 || x >= 3|| y >= 3)
            return false;
        return table[y][x] == EMPTY;
    }

    void AI() { //ходит комп
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = O;
    }

    boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == dot && table[i][1] == dot &&//проверка по горизонтали
                    table[i][2] == dot) ||
                    (table[0][i] == dot && table[1][i] == dot &&//проверка по вертикали
                            table[2][i] == dot))
                return true;
        if ((table[0][0] == dot && table[1][1] == dot &&//проверка на диагонали
                table[2][2] == dot) ||
                (table[2][0] == dot && table[1][1] == dot &&
                        table[0][2] == dot))
            return true;
        return false;
    }

    boolean isTableFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (table[row][col] == EMPTY)
                    return false;
        return true;
    }


   // BufferedWriter bufferedWriter;
   // {
   //     try {
   //         bufferedWriter = new BufferedWriter(new FileWriter("notes3.txt", true));
   //         bufferedWriter.write();
//
   //     } catch (IOException e) {
   //         e.printStackTrace();
   //     }
//
   // }

}

