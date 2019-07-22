package com.company.task_4.task_14;
import java.io.*;
public class  App {
    public static class FileRead {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            File f = new File("C:\\Users\\EVelichko\\Desktop\\Potter.txt"); // создаем Файл прописываем ему путь
            BufferedReader fin = new BufferedReader(new FileReader(f));
            String name;
            String line;
            System.out.println("Вывести содержимое файла? " + f.getName() + "? да/нет");
            name = br.readLine();
            if (name.equals("да"))
                while ((line = fin.readLine()) != null) System.out.println(line);
        }
    }
}