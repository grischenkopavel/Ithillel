package lessons.lesson7;/*
Created by Pavel Gryshchenko on 01.08.2022
*/

public class Lesson7 {
    public static void main(String[] args) {
        //switch for String Example
        switchForString(3);

        //random
        double a = Math.random();
        System.out.println("random is " + a);

        //Math.random() * (b - a) + a
        //Math.random() * (3 - 0) + 0 = 3 = Math.random() * 3
        //[0,3) from 0 until 3 (0 included 3 excluded)
        double d = Math.random() * 3;
        System.out.println("Random [0,3) from 0 until 3 (0 included 3 excluded) " + d);
        //[2,3) from 2 included, but 3 excluded
        // Math.random() = (3 - 2) + 2 = Math.random() * 2
        double c = Math.random() * 2;
        System.out.println("Random [2,3) from 2 included, but 3 excluded " + c);

        //Число в интервале [ 2; 3) (3 исключительно)
        //К диапазону [0;1) прибавляем 2. Соответственно,
        //Нижняя граница: 0 + 2 = 2
        //Верхняя граница: 1 + 2 = 3
        //Получаем диапазон [2;3)
        //Если применить нашу формулу, получим:
        //( Math.random() * (3 - 2) ) + 2  =>  Math.random() * 1 + 2  =>  Math.random() + 2
        int m = (int) (Math.random() * 2);
        System.out.println("Random [2, 3) " + m);


        maxElementFromArrayOfIntegers();

        splitStringToWords();
    }

    public static void switchForString(int inMonth) {
        int month = inMonth;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            default:
                monthString = "Wrong month";
        }
        System.out.println("Month number " + month + " is " + monthString);
    }

    /*
    Программа создающая целочисленный массив из 8 случайных чисел из диапазона [0, 99]
    вывести максимальный элемент массива в консоль
     */
    public static void maxElementFromArrayOfIntegers() {
        int maxOfArray = 0;
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            if (array[i] > maxOfArray) {
                maxOfArray = array[i];
            }
        }
        System.out.println();
        System.out.println("Max of element of array is " + maxOfArray);
    }

    //method split. Split string into words
    public static void splitStringToWords() {
        //method split. Split string into words
        String text = "Hi my name is Max";
        String[] wordsArr = text.trim().split(" ");

        for (String word : wordsArr) {
            System.out.println(word);
        }
        System.out.println("length of array is " + wordsArr.length);
    }
}
