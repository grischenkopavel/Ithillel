package lessons.lesson12;/*
Created by Pavel Gryshchenko on 25.08.2022
*/

import lessons.lesson12.enum_demo.Car;

public class Lesson12 {
    public static void main(String[] args) {
        for (Car vehicle : Car.values()
        ) {
            System.out.println(vehicle);
            if (vehicle.name().equals("FORD")) {
                System.out.println("Ford is presented");
            }
        }
    }
}
