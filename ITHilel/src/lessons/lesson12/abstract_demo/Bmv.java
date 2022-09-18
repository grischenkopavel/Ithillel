package lessons.lesson12.abstract_demo;/*
Created by Pavel Gryshchenko on 26.08.2022
*/

class Bmv extends Car {
    @Override
    String maxSpeed() {
        return null;
    }

    @Override
    void drive() {

    }

    @Override
    void brake() {

    }

    void aboutBmv() {
        System.out.println("This is BMV");
        System.out.println("Wheels count ");
        countWheels();
    }
}
