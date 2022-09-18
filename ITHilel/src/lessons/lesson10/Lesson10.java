package lessons.lesson10;/*
Created by Pavel Gryshchenko on 18.08.2022
*/
/*
Отличие && and &
Отличие || and |
& логическое "И" - (a & b) вычисляются оба условия
&& сокращенное логическое "И" - (a & b) оценивается а, b - оценивается условно
 */

public class Lesson10 {
    public static void main(String[] args) {
        int mouse = 5;
        int weight = 45;

        if (mouse != 0 & weight < 100) {
            System.out.println("True block");
        } else {
            System.out.println("Block false");
        }
        if (mouse == 7 | weight < 100) {
            System.out.println("True block");
        } else {
            System.out.println("Block false");
        }
        int a = 10;
        if (++a == 10 && ++a == 12) {
            ++a;
        }
        System.out.println(a);
    }
}
