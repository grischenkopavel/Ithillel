package homeworks.homework16.cat_dog.dog;/*
Created by Pavel Gryshchenko on 17.09.2022
*/

import homeworks.homework16.cat_dog.animal.Animal;

public class Dog extends Animal {
    String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void sound() {
        System.out.println("I'm a Dog. My name " + dogName + ". Gav");
    }
}
