package com.company.task_4.task_10;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String mysz2 = a.replaceAll("\\s","");
        System.out.println("Ваш текст:");
        System.out.println(mysz2);

    }
}