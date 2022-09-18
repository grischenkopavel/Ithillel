package lessons.lesson4;

/*
Вывести на экран  вот такие строки(используя циклы):
           А
           АА
           ААА
           АААА
           ААААА
 */
public class Animals4 {
    public static void main(String[] args) {
        String textA = "A";
        for (int i = 0; i < 6; i++) {
            System.out.println(textA);
            textA += "A";
        }
    }
}
