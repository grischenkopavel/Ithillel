package lessons.lesson4;

/*
Необходимо вывести на экран вот такую последовательность чисел с помощью цикла while:
7 14 21 28 35 42 49 56 63 70 77 84 91 98
*/
public class Test4_3 {
    public static void main(String[] args) {
        byte btNum = 7;
        while (btNum <= 98) {
            System.out.println("Number is " + btNum);
            btNum += 7;
        }
    }
}
