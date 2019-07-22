package com.company.task_4.task_2;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите число для конвертирования: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sNum = br.readLine();
        int i = Integer.parseInt(sNum);
        System.out.print("Выберите основание новой системы счисления: ");
        String sNu = br.readLine();
        int q = Integer.parseInt(sNu);
        System.out.println("В выбранной системе счисления " + i + " будет равно " + Integer.toString(i, q));
    }
}
