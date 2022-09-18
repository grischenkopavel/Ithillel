package lessons.lesson9.override;/*
Created by Pavel Gryshchenko on 11.08.2022
*/

class Cow extends Animal {
    @Override
    public void voice() {
        System.out.println("Myy");
        super.voice(); //Super method to call from Animals
    }
}
