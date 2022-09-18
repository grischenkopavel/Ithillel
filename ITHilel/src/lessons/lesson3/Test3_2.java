package lessons.lesson3;

import java.util.Scanner;

/*  Необходимо написать программу, где бы пользователю предлагалось ввести число 1.
    Если пользователь ввёл число 1, программа должна вывести сообщение: "Вы ввели число 1".
    Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 1"
*/
public class Test3_2 {
    public static void main(String[] args) {
        System.out.println("Input number 1");
        Scanner scanner = new Scanner(System.in);
        int iInputNumber = scanner.nextInt();
        if (iInputNumber == 1) {
            System.out.println("You enter number 1");
        } else {
            System.out.println("You enter number which is not equal to 1");
        }
    }
}
