package lessons.lesson11.file_write_read;/*
Created by Pavel Gryshchenko on 22.08.2022
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\grisc\\OneDrive\\IdeaProjects\\file.txt");

        Scanner scanner = new Scanner(fileReader);
        int line = 1;
        while (scanner.hasNextInt()) {
            System.out.println("line " + line + ": " + scanner.nextLine());
            line++;
        }
        fileReader.close();
    }
}
