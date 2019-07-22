package com.company.task_4.task_11;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Введите текст для первой строки:");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int a2 = a.length();
        System.out.println("Введите текст для второй строки:");
        Scanner an = new Scanner(System.in);
        String b = an.nextLine();
        int b2 = b.length();

        if(a.equals(b)){
            System.out.println("Строки равны!");
        }
        if(a2 > b2){

            System.out.println(a);
        }

        if(a2 < b2){

            System.out.println(b);
        }

    }
}