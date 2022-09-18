package lessons.lesson9.override;/*
Created by Pavel Gryshchenko on 11.08.2022
*/

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Wow");
    }
}
