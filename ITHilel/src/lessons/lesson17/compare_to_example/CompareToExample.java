package lessons.lesson17.compare_to_example;/*
Created by Pavel Gryshchenko on 19.09.2022
*/

public class CompareToExample {
    public static void main(String[] args) {
        String strExample = "a";

        System.out.println("Compare To 'a' b is " + strExample.compareTo("b"));

        strExample = "b";
        System.out.println("Compare To 'a' b is " + strExample.compareTo("a"));


        strExample = "b";
        System.out.println("Compare To 'a' b is " + strExample.compareTo("b"));
    }
}
