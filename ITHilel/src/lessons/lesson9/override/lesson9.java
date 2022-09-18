package lessons.lesson9.override;/*
Created by Pavel Gryshchenko on 11.08.2022
*/

public class lesson9 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();

        Cat cat = new Cat();
        cat.voice();

        Cow cow = new Cow();
        cow.voice();
    }
}
