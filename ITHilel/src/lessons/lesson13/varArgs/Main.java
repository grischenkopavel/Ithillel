package lessons.lesson13.varArgs;

public class Main {

    public static void main(String[] args) {
        int count = addAll(1, 1, 1);
        System.out.println(count);

        int count2 = addAll(2, 2, 2, 2, 2, 2, 2);
        System.out.println(count2);
    }

    public static int addAll(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public static int addAll(int... numbers) {
        int mathSum = 0;

        for (int num : numbers) {
            mathSum += num;
        }
        return mathSum;
    }
}
