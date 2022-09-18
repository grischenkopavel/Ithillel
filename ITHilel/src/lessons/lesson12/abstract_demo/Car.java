package lessons.lesson12.abstract_demo;/*
Created by Pavel Gryshchenko on 26.08.2022
*/

/*
Абстрактный класс задаёт какие-то общие для классов наследников методы и характеристики.
 */
abstract class Car {
    String model;
    short year;

    public Car() {

    }

    public Car(String model, short year) {
        this.model = model;
        this.year = year;
    }

    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    //non-abstract method
    void countWheels() {
        System.out.println("4");
    }
}
