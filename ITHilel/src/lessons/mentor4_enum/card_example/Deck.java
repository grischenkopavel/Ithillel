package lessons.mentor4_enum.card_example;/*
Created by Pavel Gryshchenko on 29.08.2022
*/

public class Deck {
    final static Card[] deck = new Card[36];

    public Deck() {
        int i = 0;
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                deck[i++] = new Card(rank, suit);
            }
        }
    }
}
