package lessons.lesson7;/*
Created by Pavel Gryshchenko on 01.08.2022
*/

import java.util.Arrays;

/*
Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
Вывести среднее арифметическое.
 */
public class Task7_3 {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        for (int j = 0; j < intArray.length; j++) {
            //intArray[j] = (int) ((Math.random() * 9) + 10);
            intArray[j] = returnRandomIntFromRange(20, 10);
        }

        for (int i : intArray) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Average is " + Arrays.stream(intArray).average() + " with using Arrays.stream(intArray)");
        System.out.println("Average is " + (float) Arrays.stream(intArray).sum() / (float) intArray.length);
    }

    public static int returnRandomIntFromRange(int inMax, int inMin) {
    /*
    To create a random integer number between two values (inclusive range), you can use the following formula:
    Math.random() * range) + min
    int max = 10;
    int min = 1;
    int range = max - min + 1;
    */
        int rnd = 0;
        int max = inMax;
        int min = inMin;
        int range = max - min + 1;
        rnd = (int) ((Math.random() * range) + min);
        return rnd;
    }
}
