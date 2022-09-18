package lessons.lesson12.enum_demo;/*
Created by Pavel Gryshchenko on 26.08.2022
*/

public enum Country {
    CANADA("CAD"),
    POLAND("PLN"),
    GERMANY("EUR"),
    GONDURAS;

    String currency;

    Country() {
    }

    Country(String currency) {
        this.currency = currency;
    }
}
