package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> deck = new ArrayList<>();
    public Deck(){
        deck.add(new Card("Two","Hearts", 2));
        deck.add(new Card("Three","Hearts", 3));
        deck.add(new Card("Four","Hearts", 4));
        deck.add(new Card("Five","Hearts", 5));
        deck.add(new Card("Six","Hearts", 6));
        deck.add(new Card("Seven","Hearts", 7));
        deck.add(new Card("Eight","Hearts", 8));
        deck.add(new Card("Nine","Hearts", 9));
        deck.add(new Card("Ten","Hearts", 10));
        deck.add(new Card("Jack","Hearts", 11));
        deck.add(new Card("Queen","Hearts", 12));
        deck.add(new Card("King","Hearts", 13));
        deck.add(new Card("Two","Spades", 2));
        deck.add(new Card("Three","Spades", 3));
        deck.add(new Card("Four","Spades", 4));
        deck.add(new Card("Five","Spades", 5));
        deck.add(new Card("Six","Spades", 6));
        deck.add(new Card("Seven","Spades", 7));
        deck.add(new Card("Eight","Spades", 8));
        deck.add(new Card("Nine","Spades", 9));
        deck.add(new Card("Ten","Spades", 10));
        deck.add(new Card("Jack","Spades", 11));
        deck.add(new Card("Queen","Spades", 12));
        deck.add(new Card("King","Spades", 13));
        deck.add(new Card("Two","Diamonds", 2));
        deck.add(new Card("Three","Diamonds", 3));
        deck.add(new Card("Four","Diamonds", 4));
        deck.add(new Card("Five","Diamonds", 5));
        deck.add(new Card("Six","Diamonds", 6));
        deck.add(new Card("Seven","Diamonds", 7));
        deck.add(new Card("Eight","Diamonds", 8));
        deck.add(new Card("Nine","Diamonds", 9));
        deck.add(new Card("Ten","Diamonds", 10));
        deck.add(new Card("Jack","Diamonds", 11));
        deck.add(new Card("Queen","Diamonds", 12));
        deck.add(new Card("King","Diamonds", 13));
        deck.add(new Card("Two","Clubs", 2));
        deck.add(new Card("Three","Clubs", 3));
        deck.add(new Card("Four","Clubs", 4));
        deck.add(new Card("Five","Clubs", 5));
        deck.add(new Card("Six","Clubs", 6));
        deck.add(new Card("Seven","Clubs", 7));
        deck.add(new Card("Eight","Clubs", 8));
        deck.add(new Card("Nine","Clubs", 9));
        deck.add(new Card("Ten","Clubs", 10));
        deck.add(new Card("Jack","Clubs", 11));
        deck.add(new Card("Queen","Clubs", 12));
        deck.add(new Card("King","Clubs", 13));
    }

    public Card getCard(int i){
        return deck.get(i);
    }
}
