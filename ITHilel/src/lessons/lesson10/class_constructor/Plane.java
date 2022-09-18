package lessons.lesson10.class_constructor;/*
Created by Pavel Gryshchenko on 18.08.2022
*/

public class Plane {
    private String planeName;
    private int planeAge;

    /**
     * Plane() {
     * //неявный конструктор for class Plane. Он нигода не будет виден в коде
     * }
     */
    Plane() {
        //явный конструктор без параметров for class Plane
    }

    Plane(String name, int age) {//явный constructor for class Plane
        this.planeName = name;
        this.planeAge = age;
    }

    Plane(String name) {
        this.planeName = name; //явный constructor for class Plane
    }

    Plane(int age) {
        this.planeAge = age;
    }

    void displayInfo() {
        System.out.println("Plane name " + planeName + " Plane age " + planeAge);
    }
}
