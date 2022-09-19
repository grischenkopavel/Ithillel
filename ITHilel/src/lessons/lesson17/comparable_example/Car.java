package lessons.lesson17.comparable_example;/*
Created by Pavel Gryshchenko on 19.09.2022
*/

class Car implements Comparable<Car>{
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
