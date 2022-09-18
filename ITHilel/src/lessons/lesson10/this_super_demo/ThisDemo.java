package lessons.lesson10.this_super_demo;/*
Created by Pavel Gryshchenko on 19.08.2022
*/
/*
переменная this ссылается на текущий экземпляр класса, в котором она используется
 */

public class ThisDemo {
    public int num1 = 10;
    public int num2 = 20;

    public void print() {
        int num1 = 30;

        System.out.println(num1); //result 30
        System.out.println(this.num1); //result 10
        System.out.println(num2); // result 20
    }
}
