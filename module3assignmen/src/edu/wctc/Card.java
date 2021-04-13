package edu.wctc;

public class Card {
    private String suit;
    private String number;
    private int score;
    public Card(String number, String suit, int score) {
        this.suit = suit;
        this.number = number;
        this.score = score;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    @Override
    public String toString() {
        return "Card [number=" + number + ", score=" + score + ", suit=" + suit + "]";
    }
    
}
