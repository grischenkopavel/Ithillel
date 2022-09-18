package lessons.lesson12;/*
Created by Pavel Gryshchenko on 26.08.2022
*/

import java.util.Arrays;

/*
Написать программу, которая будет заменять все четные элементы массива на 0 и выводить результат в консоль!
Массив от 1 до 10!
 */
public class Task12_2 {
    public static void main(String[] args) {
        byte[] arrayToReplace = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        replaceEvenToOdd(arrayToReplace);
        System.out.println(Arrays.toString(arrayToReplace));
    }

    static void replaceEvenToOdd(byte[] array) {
        for (byte i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }
}