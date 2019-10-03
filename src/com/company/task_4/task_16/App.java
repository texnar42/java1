package com.company.task_4.task_16;

import java.io.*;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
     File myFile = new File ("gg.txt");
try {
    PrintWriter writer = new PrintWriter((new BufferedWriter(new FileWriter(myFile, true))));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    File f = new File("gg.txt");
    BufferedReader fin = new BufferedReader(new FileReader(f));
    String name;
    String line;
    while ((line = fin.readLine()) != null) System.out.println(line);
    System.out.println("Введите текст для записи в файл:");
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    writer.println(s);
    writer.flush();
    writer.close();
    System.out.println("Текст записан!");
    }catch (IOException ex){
    ex.printStackTrace();
}
    }
}