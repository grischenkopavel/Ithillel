package lessons.mentor3.animal;/*
Created by Pavel Gryshchenko on 23.08.2022
*/

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        cat.speak();

        Cat catNew = new Cat("Murzik");
        catNew.speak();

        Cat newCat = new Cat("Vasiliy");
        newCat.speak();
    }
}
