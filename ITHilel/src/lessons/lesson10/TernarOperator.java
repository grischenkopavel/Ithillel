package lessons.lesson10;/*
Created by Pavel Gryshchenko on 18.08.2022
*/
/*
В Java существует конструкция, которая по своему действию аналогична конструкции if-else, но при этом является выражением.
Она называется тернарный оператор.
Тернарный оператор — единственный в своем роде оператор, требующий три операнда:
условие ? результат 1 : результат 2
 */

public class TernarOperator {
    public static void main(String[] args) {
        getTypeOfSentense("Hodor");
        getTypeOfSentense("Hodor?");
    }

    private static void getTypeOfSentense(String s) {
        char lastChar = s.charAt(s.length() - 1);
        System.out.println("String " + s + " is " + (lastChar == '?' ? "Question sentence" : "Not sentence"));
    }
}
