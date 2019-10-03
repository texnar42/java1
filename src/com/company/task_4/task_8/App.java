package com.company.task_4.task_8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = in.nextInt();
        int n=3;
        int[][] mass = new int[a][b];
        for (int i = 0; i < mass.length; i++)
        {
            for (int j = 0; j < mass[i].length; j++)
            {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                mass[i][j] = in.nextInt();
            }
        }
        in.close();
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length; j++) {
//                System.out.print(mass[i][j] * n + " ");
//            }
//        }

        System.out.println("Выводим первую строку массива: ");
        for (int i = a - 1; i < a; i++)
        {
            for (int j = b - 1; j < b; j++)
            {
                System.out.print(mass[i][j] * n + " ");
            }
        }
    }
}
