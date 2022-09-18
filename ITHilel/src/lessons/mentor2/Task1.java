package lessons.mentor2;/*
Created by Pavel Gryshchenko on 08.08.2022
*/

public class Task1 {

    /**
     * Написать функцию, которая переводит:
     * - все буквы "А" -> "Т"
     * - все буквы "T" -> "A"
     * - все буквы "C" -> "G"
     * - все буквы "G" -> "C"
     * Вводная строка - это набор букв «A», «T», «C», «G»
     * <p>
     * Пример:
     * "ATTGC" // вернуть "TAACG"
     * "GTAT" // вернуть "CATA"
     */

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));
    }

    public static String makeComplement(String dna) {
        String str = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') {
                str += "T"; //str = str + "T"
            }
            if (dna.charAt(i) == 'T') {
                str += "A";
            }
            if (dna.charAt(i) == 'C') {
                str += "G"; //str = str + "T"
            }
            if (dna.charAt(i) == 'G') {
                str += "C";
            }
        }

        return str;
    }
}
