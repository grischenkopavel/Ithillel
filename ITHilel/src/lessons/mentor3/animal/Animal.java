package lessons.mentor3.animal;/*
Created by Pavel Gryshchenko on 23.08.2022
*/

class Animal {
    private final String name;
    private final String voice;

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.name + " this animal says " + this.voice);
    }
}
