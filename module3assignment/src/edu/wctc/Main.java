package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        Deck deck = new Deck();
        List<Card> hand = new ArrayList<>();

        Poker poker = new Poker();
        hand.add(deck.getCard(2));
        hand.add(deck.getCard(4));
        hand.add(deck.getCard(5));
        hand.add(deck.getCard(6));
        hand.add(deck.getCard(13)); //make hand

        hand.sort(Comparator.comparing(Card::getScore)); //I found a way to sort the hand!!! YEAH!!!!!

        for (Card card : hand) {
            System.out.println(card);
        }

        System.out.println("Royal: "+poker.isRoyalFlush(hand));
        System.out.println("Straight Flush: "+poker.isStraightFlush(hand));
        System.out.println("4 of a kind: "+poker.fourKind(hand));
        System.out.println("Full House: "+poker.fullhouse(hand));
        System.out.println("Flush: "+poker.isFlush(hand));
        System.out.println("Straight: "+poker.isStraight(hand));
        System.out.println("Three of a Kind: "+poker.threeKind(hand));
        System.out.println("Two pair: "+poker.twoPair(hand));
        System.out.println("One pair: "+poker.onePair(hand));
        System.out.println("Highest Card: "+hand.get(4).getNumber()+" of "+hand.get(4).getSuit());
    }
}
