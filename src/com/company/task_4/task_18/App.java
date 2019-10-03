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
        for (int i = 0; i < size; i++)
        {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++)
        {
            int min = array[i]; // предполагаемый минимальный элемент
            int imin = i;   // индекс минимального жлемента
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < min)
                {
                    min = array[j];
                    imin = j;
                }
            }
            //Проверяем, нашелся ли элемент меньше, чем стоит на текущей позиции.
            // Если нашелся, то меняем элементы местами
            if (i != imin)
            {
                int temp = array[i];
                array[i] = array[imin];
                array[imin] = temp;
            }
            System.out.print(array[i] + " ");
        }
    }
}