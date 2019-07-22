package com.company.task_4.task_7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите кол-во чисел в массиве: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        int n = 2;
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Вывод массива:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i] * n );
        }
        System.out.println();

    }
}
