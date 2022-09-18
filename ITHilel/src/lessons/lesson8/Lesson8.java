package lessons.lesson8;/*
Created by Pavel Gryshchenko on 04.08.2022
*/

public class Lesson8 {
    public static void main(String[] args) {
        //Деление по модулю %
        int n = 9;
        int k = 4;
        int m = n % k;
        // 9 - 4 = 5
        // 5 - 4 = 1
        System.out.println("Divide by module is " + m);

        int iYear, twoDigit, threeDigit;
        iYear = 2013;
        twoDigit = iYear % 100;
        threeDigit = iYear / 10;
        System.out.println("twoDigit from " + iYear + " " + twoDigit);
        System.out.println("threeDigit from " + iYear + " " + threeDigit);


    }
}
