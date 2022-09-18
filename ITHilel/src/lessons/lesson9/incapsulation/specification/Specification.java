package lessons.lesson9.incapsulation.specification;/*
Created by Pavel Gryshchenko on 11.08.2022
*/

public class Specification {

    private String fuel = "petrol";

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void color() {
        System.out.println("Red");
    }
}
