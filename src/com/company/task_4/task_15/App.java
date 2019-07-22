package com.company.task_4.task_15;
import java.io.*;
import java.util.Scanner;

public class  App {
    public static class FileRead {
        public static void main(String[] args) throws Exception {
            System.out.println("Введите текст");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            FileWriter writer = new FileWriter("C:\\Users\\EVelichko\\Desktop\\Potter.txt");
            writer.write(s);
            writer.close();
        }
    }
}