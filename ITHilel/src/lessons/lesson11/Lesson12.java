package lessons.lesson11;/*
Created by Pavel Gryshchenko on 22.08.2022
*/

public class Lesson12 {
    public static void main(String[] args) {
        short a = 5;
        short b = 5;
        String c = "5";

        int x = ++b + a++;
        b += x;
        System.out.println(b + "" + c);

        short z = 1;
        short y = ++z;
        System.out.println(y);
        System.out.println(z);
        y += z;
        System.out.println(y);
        System.out.println(z);
    }
}
