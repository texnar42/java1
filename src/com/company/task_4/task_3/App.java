package com.company.task_4.task_3;
import java.util.Scanner;
public class App {
    public static void main(String... args){
        System.out.println("Введите  число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i < 11; i++){
            for(int k = 1; k < 11; k++){
                System.out.print(k * i + "  ");
            }
            System.out.println("");
        }
    }
}
