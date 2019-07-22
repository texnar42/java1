package com.company.task_4.task_5;
import java.util.Scanner;
public class AverageWithMethods {

    public static void main(String args[]){
        System.out.println("Введите число 1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите число 2: ");
        int b = sc.nextInt();
        System.out.println("Введите число 3: ");
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(avg);
        int num = avg/2;
        if (num> 3) {

            System.out.println(num);
        }
    }
}