package lessons.lesson12.interface_demo;/*
Created by Pavel Gryshchenko on 26.08.2022
*/

interface Car {
    public final static String NAME = "Car"; //public final static by default

    String maxSpeed();

    void brake();

    void drive();

}
