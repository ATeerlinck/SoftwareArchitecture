package edu.wctc;

import java.util.List;

public class Poker {

    public boolean isStraight(List<Card> hand){
        boolean isTheHand = true;
        int prevScore = 0;
        int score = 0;
        for(int i=0;i<5;i++){
            Card card = hand.get(i);
            score = card.getScore();
            if(score==prevScore++||i!=0) isTheHand = false;
            else {
                isTheHand = true;
                break;
            } 
            prevScore = score;
        }
        return isTheHand;
    }

    public boolean isFlush(List<Card> hand){
        boolean isTheHand = true;
        String prevSuit = "";
        String suit = "";
        for(int i=0;i<5;i++){
            Card card = hand.get(i);
            suit = card.getSuit();
            if(suit.equalsIgnoreCase(prevSuit)||i!=0) isTheHand = false;
            else {
                isTheHand = true;
                break;
            } 
            prevSuit = suit;
        }
        return isTheHand;
    }

    public boolean isStraightFlush(List<Card> hand){
        if(isStraight(hand)&&isFlush(hand)) return false;
        else return true;
    }
}