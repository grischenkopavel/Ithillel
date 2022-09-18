package lessons.lesson7;
/*
Created by Pavel Gryshchenko on 01.08.2022
*/
/*
Написать программу, в которой пользователю предлагается ввести в консоль текст "Привет меня зовут Максим".
Далее создать массив и записать каждое слово в отдельный элемент массива.
Вывести в консоль строку из элементов массива в обратном порядке используя формулу  n-i-1.
Каждое действие должно выполняться в отдельном методе! Т.е. В методе main только вызов пользовательских методов!
 */

import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {
        consoleOutput();
        String inputTextFromScanner = getInputString();
        String[] arrAfterSplit = arrayFromStr(inputTextFromScanner);
        String[] arrAfterReverse = reverseArray(arrAfterSplit);
        printArray(arrAfterReverse);
    }

    private static void printArray(String[] arrayIn) {
        for (String array : arrayIn) {
            System.out.print(array + " ");
        }
    }

    private static String[] reverseArray(String[] arrAfterSplit) {
        String[] reversArr = arrAfterSplit;
        String tmp = null;
        int count = reversArr.length;
        for (int i = 0; i < count / 2; i++) {
            tmp = reversArr[count - i - 1];
            reversArr[count - i - 1] = reversArr[i];
            reversArr[i] = tmp;
        }
        return reversArr;
    }

    private static String[] arrayFromStr(String str) {
        String[] array = str.trim().split("");
        return array;
    }

    public static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static void consoleOutput() {
        System.out.println("Input some text please");
    }
}