package lessons.lesson9.incapsulation.car;/*
Created by Pavel Gryshchenko on 11.08.2022
*/

import lessons.lesson9.incapsulation.specification.Specification;

public class Bmv {
    public static void main(String[] args) {
        Specification specification = new Specification();
        System.out.println(specification.getFuel());

        specification.setFuel("diesel");
        System.out.println(specification.getFuel());
    }
}
