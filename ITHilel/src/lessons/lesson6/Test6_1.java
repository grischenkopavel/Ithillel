package lessons.lesson6;/*
Created by Pavel Gryshchenko on 29.07.2022
*/

/*
С помощью цикла и условного оператора вывести в консоль:
Это 1-й урок!
      Я выполнил все домашние задания 1-го урока.
Это 2-й урок!
      Я выполнил все домашние задания 2-го урока.
Это 3-й урок!
       Я не выполнил домашние задания 3-го урока.
 */
public class Test6_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println("This is " + i + "-st lesson!");
            if (i != 3) {
                System.out.println("      I am done with all homework for " + i + "-st lesson!");
            } else {
                System.out.println("      I am not done with all homework for " + i + "-rd lesson!");
            }
        }
    }
}
