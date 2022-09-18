package lessons.lesson6;/*
Created by Pavel Gryshchenko on 29.07.2022
*/
/*
С помощью циклов FOR вывести в консоль пирамиду из звездочек.
      *
     * *
    * * *
   * * * *
  * * * * *

 */

public class Test6_2 {
    public static void main(String[] args) {
        //pyramidFromStars();
        //herringboneFromStars();
        pyramidFromStarsFinal();
    }

    public static void pyramidFromStars() {
        int changeFactor = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == (5) + changeFactor || j == (5) - changeFactor) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            changeFactor++;
        }
    }

    public static void herringboneFromStars() {
        int changeFactor = 0;
        int changeFactor2 = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((j == 5 + changeFactor || j == 5 - changeFactor) || (i == 4 && j == 5 + changeFactor2 || j == 5 - changeFactor2)) {
                    System.out.print("*");
                } else {
                    if (i == 3 && j == 5 || i == 5 && j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            changeFactor++;
        }
    }

    public static void pyramidFromStarsFinal() {
        int changeFactor = 0;
        int changeFactor2 = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((j == 5 + changeFactor || j == 5 - changeFactor)) {
                    System.out.print("*");
                } else {
                    if (i >= 3) {
                        if (j == 5 + changeFactor2 || j == 5 - changeFactor2) {
                            System.out.print("*");
                        } else {
                            if (i == 5 && j == 5) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            changeFactor++;
            if (i >= 3) {
                changeFactor2++;
            }
        }
    }
}
