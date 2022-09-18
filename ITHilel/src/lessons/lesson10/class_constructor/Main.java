package lessons.lesson10.class_constructor;/*
Created by Pavel Gryshchenko on 18.08.2022
*/

public class Main {
    public static void main(String[] args) {
        Plane defaultPlane = new Plane();
        Plane plane = new Plane("Boeing", 8);
        Plane airbus = new Plane("Airbus");

        defaultPlane.displayInfo();
        plane.displayInfo();
        airbus.displayInfo();
    }
}
