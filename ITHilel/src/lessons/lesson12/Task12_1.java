package lessons.lesson12;/*
Created by Pavel Gryshchenko on 25.08.2022
*/
/*
Необходимо написать программу «Счастливое число».
Давайте представим, что у нас есть промежуток из 10 чисел, счастливым числом будет являться 3!
Нужно написать программу, которая ищет счастливое число!
Программа перебирает числа по одному, и когда доходит до 3-го числа — напишет "Вот счастливое число!" и выходит из цикла.
При разработке необходимо использовать цикл и условный оператор!
 */

class Task12_1 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {56, 5, 8, 9, 0, 3, 8, 2, 10, 156};
        findLuckyNumber(arrayOfNumbers);
        findLuckyNumberForEach(arrayOfNumbers);
    }

    static void findLuckyNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                System.out.println("This is Lucky Number! " + array[i]);
                break;
            }
            if (i == array.length - 1 && array[i] != 3) {
                System.out.println("No luck with this array");
            }
        }
    }

    static void findLuckyNumberForEach(int[] array) {
        for (int number : array) {
            if (number != 3) {
                continue;
            }
            System.out.println("This is Lucky Number! " + number);
            break;
        }
    }
}
