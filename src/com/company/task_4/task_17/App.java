package com.company.task_4.task_17;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в двоичной системе: ");
        String str = scanner.nextLine();
        int n = 0;
        for (int i = 0; i < str.length(); i++)
        {
            n <<= 1;
            if (str.charAt(i) == '1') n++;
        }
        System.out.println("\"" + str + "\" -> " + n);
    }
}

