package edu.wctc.test;

import edu.wctc.Card;
import edu.wctc.Deck;
import edu.wctc.Poker;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class PokerTest {
    Deck deck = new Deck();
    List<Card> hand = new ArrayList<Card>();
    Poker poker = new Poker();

    @BeforeEach
    void runIt() {
        hand.add(deck.getCard(2));
        hand.add(deck.getCard(9));
        hand.add(deck.getCard(4));
        hand.add(deck.getCard(5));
        hand.add(deck.getCard(6));

        hand.sort(Comparator.comparing(Card::getScore));
    }
    @org.junit.jupiter.api.Test
    void isRoyalFlush() {
        assertTrue(poker.isRoyalFlush(hand));
    }

    @org.junit.jupiter.api.Test
    void isStraightFlush() {
        assertTrue(poker.isStraightFlush(hand));
    }

    @org.junit.jupiter.api.Test
    void fourKind() {
        assertTrue(poker.fourKind(hand));
    }

    @org.junit.jupiter.api.Test
    void fullhouse() {
        assertTrue(poker.fullhouse(hand));
    }

    @org.junit.jupiter.api.Test
    void isFlush() {
        assertTrue(poker.isFlush(hand));
    }

    @org.junit.jupiter.api.Test
    void isStraight() {
        assertTrue(poker.isStraight(hand));
    }

    @org.junit.jupiter.api.Test
    void threeKind() {
        assertTrue(poker.threeKind(hand));
    }

    @org.junit.jupiter.api.Test
    void twoPair() {
        assertTrue(poker.twoPair(hand));
    }

    @org.junit.jupiter.api.Test
    void onePair() {
        assertTrue(poker.onePair(hand));
    }

    @org.junit.jupiter.api.Test
    void displayHigh() {
        assertTrue(hand.get(4).getScore()>=hand.get(3).getScore()||hand.get(4).getScore()>=hand.get(2).getScore()||hand.get(4).getScore()>=hand.get(1).getScore()||hand.get(4).getScore()>=hand.get(0).getScore());
    }
}