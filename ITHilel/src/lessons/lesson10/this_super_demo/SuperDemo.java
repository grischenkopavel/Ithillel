package lessons.lesson10.this_super_demo;/*
Created by Pavel Gryshchenko on 19.08.2022
*/
/*
переменная super ссылается на текущий экземпляр родительского класса
 */

public class SuperDemo {
    int value = 10;
}

class Child extends SuperDemo {
    int value = 20;

    public void print() {
        int value = 30;
        System.out.println(value); //30
        System.out.println(this.value); // 20
        System.out.println(super.value); // 10
    }
}
