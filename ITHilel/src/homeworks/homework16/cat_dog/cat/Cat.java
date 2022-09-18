package homeworks.homework16.cat_dog.cat;/*
Created by Pavel Gryshchenko on 17.09.2022
*/

import homeworks.homework16.cat_dog.animal.Animal;

public class Cat extends Animal {
    public String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public void sound() {
        System.out.println("I'm a Cat. My name " + catName + ". Mew");
    }
}
