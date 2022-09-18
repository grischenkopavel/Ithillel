package lessons.mentor4_enum.card_example;/*
Created by Pavel Gryshchenko on 29.08.2022
*/

public class CardRunner {
    public static void main(String[] args) {
        Rank rank = Rank.ACE;
        System.out.println(rank.getTranslation());
        Suit suit = Suit.DIAMONDS;
        System.out.println(suit.name());
    }
}
