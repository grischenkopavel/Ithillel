package lessons.mentor4_enum.card_example;/*
Created by Pavel Gryshchenko on 29.08.2022
*/

public enum Rank {
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("jack"),
    QUEEN("queen"),
    KING("king"),
    ACE("ace");

    private String translation;

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "translation= " + translation;
    }

    Rank(String translation) {
        this.translation = translation;
    }
}
