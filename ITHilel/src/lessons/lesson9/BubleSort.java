package lessons.lesson9;/*
Created by Pavel Gryshchenko on 11.08.2022
*/
/*
int[] array = {11, 3, 1, 14, 7};
Написать метод сортировки массива от большего к меньшему
 */

public class BubleSort {
    public static void main(String[] args) {
        int[] array = {11, 3, 1, 14, 7};

        printArray(array);

        //printArray(sortedByAscendingArray(array));

        //printArray(sortedByDescendingArray(array));

        printArray(sortedByAscDescArray(array, false));
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] sortedByAscendingArray(int[] inArr) {

        boolean isSorted = false;
        int buffer;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < inArr.length - 1; i++) {
                if (inArr[i] > inArr[i + 1]) {
                    isSorted = false;

                    buffer = inArr[i];
                    inArr[i] = inArr[i + 1];
                    inArr[i + 1] = buffer;
                }
            }
        }
        return inArr;
    }

    private static int[] sortedByDescendingArray(int[] inArr) {
        boolean isSorted = false;
        int buffer;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < inArr.length - 1; i++) {
                if (inArr[i] < inArr[i + 1]) {
                    isSorted = false;

                    buffer = inArr[i];
                    inArr[i] = inArr[i + 1];
                    inArr[i + 1] = buffer;
                }
            }
        }
        return inArr;
    }

    private static int[] sortedByAscDescArray(int[] inArr, boolean order) {
        boolean isSorted = false;
        int buffer;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < inArr.length - 1; i++) {
                if (order ? inArr[i] > inArr[i + 1] : inArr[i] < inArr[i + 1]) {
                    isSorted = false;

                    buffer = inArr[i];
                    inArr[i] = inArr[i + 1];
                    inArr[i + 1] = buffer;
                }
            }
        }
        return inArr;
    }
}
