package lessons.lesson8;/*
Created by Pavel Gryshchenko on 04.08.2022
*/

class Cat extends CatFamily {
    public static void main(String[] args) {
        eat();
    }
    //eat() why eat is not accessible from Cat? without main

    public static String name = "Marfa";

    public static void sayMay() {
        System.out.println("May");
    }

    public static void jump() {
        System.out.println("Jump");
    }

    public static void run() {
        System.out.println("Run");
    }

}
