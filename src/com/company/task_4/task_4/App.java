package com.company.task_4.task_4;

import java.util.Scanner;

public class App {

   static final int X = 1;
   static final int Y = 2;
   static final int Z = 3;

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
//        System.out.println("Введите второе число:");
//        int b = scanner.nextInt();
//        System.out.println("Введите третье число:");
//        int c = scanner.nextInt();
        if (a==X || a==Y || a== Z)
        {
            System.out.println( "Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }


    }
}
