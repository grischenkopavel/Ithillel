package homeworks.homework16.main;/*
Created by Pavel Gryshchenko on 17.09.2022
*/

import homeworks.homework16.cat_dog.animal.Animal;
import homeworks.homework16.cat_dog.cat.Cat;
import homeworks.homework16.cat_dog.dog.Dog;

import java.util.ArrayList;
import java.util.List;

class Practice_cat_dog {
    public static void main(String... args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
