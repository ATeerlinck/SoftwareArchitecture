package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class main {

    private static void main(String[] args){
        Deck deck = new Deck();
        List<Card> hand = new ArrayList<>();

        Poker poker = new Poker();
        hand.add(deck.getCard(2));
        hand.add(deck.getCard(3));
        hand.add(deck.getCard(4));
        hand.add(deck.getCard(5));
        hand.add(deck.getCard(7));

        for (Card card : hand) {
            System.out.println(card);
        }

        System.out.println(poker.isFlush(hand));
        System.out.println(poker.isStraight(hand));
        System.out.println(poker.isStraightFlush(hand));
    }
}
