package lessons.mentor4_enum.card_example;/*
Created by Pavel Gryshchenko on 29.08.2022
*/

public enum Suit {
    DIAMONDS(6),
    CLUBS(5),
    HEARTS(9),
    SPADES(7);

    private int cardCount;

    Suit(int cardCount) {
        this.cardCount = cardCount;
    }

    public int getCardCount() {
        return cardCount;
    }
}
