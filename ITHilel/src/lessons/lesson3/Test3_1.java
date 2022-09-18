package lessons.lesson3;

import java.util.Scanner;

public class Test3_1 {

    public static void main(String[] args) {
//        int k = 10;
//        System.out.println("Sqrt: " + sqrt(k));
        System.out.println("Enter two numbers ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = num1 + num2;

        System.out.println("Enter text ");
        Scanner scanner1 = new Scanner(System.in);
        String text = scanner1.nextLine();

        System.out.println(text + " " + result);
    }
}
