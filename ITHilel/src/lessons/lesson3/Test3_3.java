package lessons.lesson3;

import java.util.Scanner;

/*
    Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
    а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3 и в том случаи,
    если пользователь ввёл какое-либо другое число программа должна отвечать „Вы ввели число не равное 1, 2 или 3“
*/
public class Test3_3 {
    public static void main(String[] args) {
        System.out.println("Input number 1, 2 or 3");
        Scanner scanner = new Scanner(System.in);
        int iInputThreeNumbers = scanner.nextInt();

        if (iInputThreeNumbers == 1) {
            System.out.println("You enter number " + iInputThreeNumbers);
        } else if (iInputThreeNumbers == 2) {
            System.out.println("You enter number " + iInputThreeNumbers);
        } else if (iInputThreeNumbers == 3) {
            System.out.println("You enter number " + iInputThreeNumbers);
        } else {
            System.out.println("You enter number which is not equal to 1, 2 or 3");
        }
    }
}
