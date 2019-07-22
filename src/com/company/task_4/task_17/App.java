package com.company.task_4.task_17;

public class App {
    public static void main(String[] args) {
        int[] b = new int[255];
        int col = 0;
        System.out.print("Введите 10-чное число: ");
        int a = new java.util.Scanner(System.in).nextInt();
        for (int i = a/2; i >= 1; a/=2, i/=2, col++){
            if (a % i == 0)
                b[col] = 0;
            else
                b[col] = 1;
            if (i == 1)
                b[col+1] = 1;
        }
        System.out.print("Число в двоичной системе: ");
        for (int i = col; i > -1; i--)
            System.out.print(b[i]);
    }
}
