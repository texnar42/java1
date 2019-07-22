package com.company.task_4.task_18;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String... args) {

        //задать размер массива
        // заполнить числами массив
        //задать сортировку массива по возрастанию с помощью выбора

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите кол-во чисел в массиве: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Вывод массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
        System.out.println("Вывод отсортированного массива");
        choice(array);

    }

    public static void choice(int[] arraysort) {
        int indexMin;

        for (int i = 0; i < arraysort.length - 1; i++) {
            indexMin = i;
            for (int indextoScan = i; indextoScan < arraysort.length; indextoScan++) {
                if (arraysort[indexMin] > arraysort[indextoScan]) {
                    indexMin = indextoScan;
                }
                int temp = arraysort[i];
                arraysort[i] = arraysort[indexMin];
                arraysort[i] = temp;
            }
        }



        //  arraysort[index] = arraysort[indexMin];


        System.out.println(Arrays.toString(arraysort));
    }
}
