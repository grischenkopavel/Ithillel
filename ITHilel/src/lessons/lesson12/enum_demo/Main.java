package lessons.lesson12.enum_demo;/*
Created by Pavel Gryshchenko on 26.08.2022
*/

public class Main {
    public static void main(String[] args) {
        for (Country country : Country.values()
        ) {
            System.out.println(country + " , " + country.currency);
        }
    }
}
