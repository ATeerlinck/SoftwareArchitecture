package edu.wctc.pocker;

import java.util.List;

public class Poker {

    public boolean isStraight(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        int score = 0;
        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            score = card.getScore();
            if ((score != prevScore+1) && (i != 0)) isTheHand = false;
            prevScore = score;
        }
        return isTheHand;
    }
    public boolean isStraightFlush(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        String prevSuit = "";
        int score = 0;
        String suit = "";
        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            score = card.getScore();
            suit = card.getSuit();
            if (((score != prevScore+1) && (i != 0)) || ((!suit.equalsIgnoreCase(prevSuit)) && (i != 0))) isTheHand = false;
            prevScore = score;
            prevSuit = suit;
        }
        return isTheHand;
    }
}
