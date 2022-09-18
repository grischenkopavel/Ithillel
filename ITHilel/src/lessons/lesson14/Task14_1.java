package lessons.lesson14;/*
Created by Pavel Gryshchenko on 06.09.2022
*/
/*
Дано : int []a = {1, 2, 3, 4, 5, 6};

Написать метод, который будет принимать
два параметра:
Массив данных
Число
Метод должен добавлять в конец принимаемого массива
число из параметров и возвращать изменённый массив!

Без использования метода Arrays.copyOf и подобных!
 */

class Task14_1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        printArray(a);
        System.out.println();
        printArray(extendArray(a, 7));
    }

    static int[] extendArray(int[] arrayToExtend, int extendNum) {
        int[] extendedArray = new int[arrayToExtend.length + 1];
        for (int i = 0; i < extendedArray.length; i++) {
            if (i < extendedArray.length - 1) {
                extendedArray[i] = arrayToExtend[i];
            } else {
                extendedArray[i] = extendNum;
            }
        }
        return extendedArray;
    }

    static void printArray(int[] arrayToExtend) {
        for (int element : arrayToExtend) {
            System.out.print(element + " ");
        }
    }
}
