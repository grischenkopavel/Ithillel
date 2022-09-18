package lessons.lesson6;/*
Created by Pavel Gryshchenko on 28.07.2022
*/

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        String textHello = "Hello I am MAKS";

        if (textHello.equalsIgnoreCase("Hello I am Maks")) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }
        String textAlex = "Hello I am MAKS";
        System.out.println(textAlex.indexOf("l"));
        System.out.println(textAlex.lastIndexOf("l"));

        int num = 12346;
        String strNum = String.valueOf(num);
        System.out.println(strNum);

        //Классы-оболочки Java
        String strNum2 = "554548";
        int intToStr = Integer.parseInt(strNum2);
        System.out.println("String " + strNum2 + " parsed into int " + intToStr);

        double flNum = 5.5;
        System.out.println("Math.round  from " + flNum + " is " + Math.round(flNum));
        System.out.println("Math.floor from " + flNum + " is " + Math.floor(flNum));
        System.out.println("Math.ceil from " + flNum + " is " + Math.ceil(flNum));

        String[] myArr = {"Hi", "my", "name", "Maks"};
        //Hi my name maks -> Maks name my Hi
        reverseArray(myArr);

        countWords();

        //countWordsWithoutSpaces();
    }

    //method to reverse string array
    public static void reverseArray(String[] inArr) {
        int arrLength = inArr.length;

        String tmp;

        for (int i = 0; i < arrLength / 2; i++) {
            tmp = inArr[arrLength - i - 1];
            inArr[arrLength - i - 1] = inArr[i];
            inArr[i] = tmp;
        }
        for (String strOut : inArr) {
            System.out.print(strOut + " ");
        }
    }

    //count number of words in sentence without spaces
    public static void countWords() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence ");

        String inputStr = scanner.nextLine();

        int countSpace = 0;
        //int countNextSpace = 0;
        if (inputStr.length() != 0) {
            countSpace++;
            for (int i = 0; i < inputStr.length(); i++) {
                if (inputStr.charAt(i) == ' ' && inputStr.charAt(i - 1) != ' ') {
                    countSpace++;
//                    if (i >= 1) {
//                        if (inputStr.charAt(i - 1) == ' ') {
//                            countNextSpace++;
//                            countSpace--;
//                        }
//                    }

                }
            }
        }
        System.out.println("Number of words is " + countSpace);
        //System.out.println("Number of space's is " + (countNextSpace));
    }

    public static void countWordsWithoutSpaces() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Input string");

        String input = scanner.nextLine();

        int count = 0;
        if (input.length() != 0) {
            if (input.charAt(0) != ' ') {
                count++;
            }
            for (int i = 0; i < input.length(); i++) {

                if (input.charAt(i) == ' ' && (i + 1) < input.length() && input.charAt(i + 1) != ' ') {
                    count++;
                }
            }

        }

        System.out.println("Your string contain " + count + " words");

    }
}
