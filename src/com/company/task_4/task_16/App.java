package com.company.task_4.task_16;

import java.io.*;


public class App {

    public static void main(String[] args) {
     File myFile = new File ("gg.txt");// в данном случае файл будет в проекте создаваться и перезаписываться
try {
    PrintWriter writer = new PrintWriter((new BufferedWriter(new FileWriter(myFile, true))));
    writer.println("Привет Влад");
    writer.flush();
    writer.close();
    }catch (IOException ex){
    ex.printStackTrace();
}
    }
}