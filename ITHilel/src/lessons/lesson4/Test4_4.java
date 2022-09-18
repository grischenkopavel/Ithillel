package lessons.lesson4;

/*
Необходимо вывести на экран вот такую последовательность чисел с помощью цикла while:
1 2 4 8 16 32 64 128 256 512
 */
public class Test4_4 {
    public static void main(String[] args) {
        int iGeometricSequence = 1;
        while (iGeometricSequence <= 512) {
            System.out.println("Number is " + iGeometricSequence);
            iGeometricSequence += iGeometricSequence;
        }
    }
}
