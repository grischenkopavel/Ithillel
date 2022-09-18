package lessons.lesson5;

/*
Необходимо написать метод, который бы возвращал из 2 чисел меньшее число. Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.
 */
public class Test5_2 {
    public static void main(String[] args) {
        byte btNumOne = 100;
        byte btNumTwo = 120;
        System.out.println(lessFromTwoNumbers(btNumOne, btNumTwo));
    }

    static byte lessFromTwoNumbers(byte btFirstNum, byte btSecondNum) {
        if (btFirstNum > btSecondNum) {
            return btSecondNum;
        } else {
            return btFirstNum;
        }
    }
}
