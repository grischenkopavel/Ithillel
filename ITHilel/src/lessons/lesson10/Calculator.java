package lessons.lesson10;/*
Created by Pavel Gryshchenko on 19.08.2022
*/
/*
ДЗ 16. Написать программу калькулятор (для двух целых чисел)
Метод int getInt() - должен считывать с консоли целое число и возвращать его
Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calc(getInt(), getInt(), getOperation()));
    }

    static int getInt() {
        int inputNum = 0;
        System.out.println("Input whole number");
        Scanner scanner = new Scanner(System.in);
        try {
            inputNum = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
        return inputNum;
    }

    static char getOperation() {
        String operator;
        System.out.println("Input operator (+, -, * or /)");
        Scanner scanner = new Scanner(System.in);
        operator = scanner.nextLine();
        if (operator.charAt(0) == '+' || operator.charAt(0) == '-' || operator.charAt(0) == '*' || operator.charAt(0) == '/') {
            return operator.charAt(0);
        } else {
            return ' ';
        }
    }

    static int calc(int num1, int num2, char operation) {
        int result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case ' ':
                System.out.println("Error wrong operator");
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }
}

