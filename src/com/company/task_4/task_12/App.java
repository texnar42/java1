package com.company.task_4.task_12;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Введите число  (тип String)");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println("Число  (тип int)");
        System.out.println(Integer.parseInt(s));

        System.out.println("Число  (тип double)");
        double y = Integer.parseInt(s);
        System.out.println(y);
    }
}
