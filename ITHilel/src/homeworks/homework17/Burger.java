package homeworks.homework17;/*
Created by Pavel Gryshchenko on 26.09.2022
*/

import java.util.LinkedList;
import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        LinkedList<String> burger = new LinkedList<>();
        burger.add(burgerChoice());
        while (burgerNeedMoreIngredients()) {
            burger.add(burgerChoice());
        }
        printBurger(burger);
    }

    static String burgerChoice() {
        System.out.println("Choose additional ingredients for burger: \nketchup - 10 \ncheese - 20 \nmeat - 30");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static boolean burgerNeedMoreIngredients() {
        System.out.println("Do you want additional ingredients? Select 'Y' or 'N'");
        Scanner scanner = new Scanner(System.in);
        String wantToProceed = scanner.nextLine();
        if (wantToProceed.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }

    static void printBurger(LinkedList<String> listToPrint) {
        System.out.println("Your burger contain");
        for (String element : listToPrint) {
            System.out.println(element);
        }
        System.out.println("Your burger cost =  " + getBurgerCost(listToPrint));
    }

    static int getBurgerCost(LinkedList<String> burgerList) {
        int burgerCost = 50;
        for (String element : burgerList) {
            switch (element) {
                case "ketchup":
                    burgerCost += 10;
                    break;
                case "cheese":
                    burgerCost += 20;
                    break;
                case "meat":
                    burgerCost += 30;
                    break;
                case "10":
                    burgerCost += 10;
                    break;
                case "20":
                    burgerCost += 20;
                    break;
                case "30":
                    burgerCost += 30;
                    break;
                default:
                    System.out.println("Something is wrong");
            }
        }
        return burgerCost;
    }
}
