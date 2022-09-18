package lessons.lesson11;/*
Created by Pavel Gryshchenko on 22.08.2022
*/

public class brakeOperator {


    public static void main(String[] args) {
        int i = 1;
        int a = 3;
        while (i <= 5) {
            System.out.println(i);
            if (i == a) {
                break;
            }
            i++;
        }
    }
}
