package lessons.mentor4_enum;/*
Created by Pavel Gryshchenko on 29.08.2022
*/

public class main_enum_demo {
    public static void main(String[] args) {

        for (Education item : Education.values()) {
            System.out.println(item);
        }

    }
}
