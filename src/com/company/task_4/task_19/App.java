package com.company.task_4.task_19;
import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double a = in.nextDouble();

        while (a<=0) {
            System.out.print("Введите корректный курс доллара: ");
            a = in.nextDouble();
        }

        Scanner an = new Scanner(System.in);
        System.out.print("Введите кол-во рублей: ");
        double b = an.nextDouble();

        while (b<0) {
            System.out.print("Введите корректный кол-во рублей: ");
            b = in.nextDouble();
        }

        double var = b/a;
        System.out.println(String.format("%(.2f долларов", var));

    }

}


