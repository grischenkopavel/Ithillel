package lessons.lesson11.file_write_read;/*
Created by Pavel Gryshchenko on 22.08.2022
*/

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Text.txt");
        fileWriter.write("Hello world");
        fileWriter.close();

        write(5, 10);
    }

    public static void write(int first, int second) throws IOException {
        FileWriter fileWriter = new FileWriter("file.txt");
        for (int i = first; i <= second; i++) {
            fileWriter.write(i + "\n");
        }
        fileWriter.close();
    }
}
