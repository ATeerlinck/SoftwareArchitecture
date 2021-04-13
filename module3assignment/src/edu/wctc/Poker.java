package edu.wctc;

import java.util.List;

public class Poker {

    public boolean isStraight(List<Card> hand){
        boolean isTheHand = true;
        int prevScore = 0;
        for(int i=0;i<5;i++){
            Card card = hand.get(i);
            prevScore++;
            if(i==0){} //this buffers the first card for the loop setup. each for loop in here has it.
            else if(card.getScore()==prevScore) isTheHand = true;
            else{
                isTheHand = false;
                break;
            } 
            prevScore = card.getScore();
        }
        return isTheHand;
    }

    public boolean isRoyal(List<Card> hand){
        boolean isTheHand = true;
        int prevScore = 10;
        for(int i=0;i<5;i++){
            Card card = hand.get(i);
            prevScore++;
            if(i==0){}
            else if(card.getScore()==prevScore) isTheHand = true;
            else{
                isTheHand = false;
                break;
            }
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
            if(i==0){}
            else if(suit.equalsIgnoreCase(prevSuit)) isTheHand = true;
            else {
                isTheHand = false;
                break;
            } 
            prevSuit = suit;
        }
        return isTheHand;
    }

    public boolean fourKind(List<Card> hand){
        boolean isTheHand = false;
        int trueTally = 0;
        int falseTally = 0;
        int prevScore = 0;
        for(int i=0;i<5;i++){
            Card card = hand.get(i);
            if(i==0){}
            else if(card.getScore()==prevScore){
                trueTally++;
            }
            else{
                falseTally++;
                trueTally=0;
                if(falseTally == 2) break;
            }
            prevScore = card.getScore();
        }
        if(trueTally >= 3) isTheHand = true;
        return isTheHand;
    }

    public boolean threeKind(List<Card> hand){
        boolean isTheHand = false;
        int trueTally = 0;
        int falseTally = 0;
        int prevScore = 0;
        for(int i=0;i<5;i++){
            Card card = hand.get(i);
            if(i==0){}
            else if(card.getScore()==prevScore){
                isTheHand = true;
                trueTally++;
                if(trueTally == 2) break;
            }
            else{
                isTheHand = false;
                falseTally++;
                if(falseTally == 2) break;
            }
            prevScore = card.getScore();
        }
        return isTheHand;
    }
    
    public boolean fullhouse(List<Card> hand){
        boolean isTheHand = false;
        int trueTally = 0;
        int falseTally = 0;
        int numberTally = 0;
        int prevScore = 0;
        boolean notUsed = true;
        for(int i=0;i<5;i++){
            Card card = hand.get(i);
            if(i==0){}
            else if(card.getScore()==prevScore){
                numberTally++;
                if(numberTally == 2){ 
                    numberTally = 0;
                    trueTally++;
                }
            }
            else if(card.getScore()!=prevScore&&numberTally==1&&notUsed){
                numberTally = 0;
                trueTally++;
                notUsed = false;
            }
            else{
                falseTally++;
                if(falseTally==2)break;
            }
            prevScore = card.getScore();
        }
        if(numberTally>=1) trueTally++;
        if(trueTally == 2) isTheHand = true;
        if(fourKind(hand)) isTheHand = false;
        return isTheHand;
    }
    public boolean twoPair(List<Card> hand){
        boolean isTheHand = false;
        int trueTally = 0;
        int falseTally = 0;
        int numberTally = 0;
        int prevScore = 0;
        for(int i=0;i<5;i++){
            Card card = hand.get(i);
            if(i==0){}
            else if(card.getScore()==prevScore){
                numberTally++;
            }
            else if(card.getScore()!=prevScore&&numberTally>=1){
                numberTally = 0;
                trueTally++;
            }
            else{
                falseTally++;
                if(falseTally == 2) break;
            }
            if(card.getScore()==prevScore&&numberTally>=2){
                numberTally = 0;
                trueTally++;
            }
            prevScore = card.getScore();
        }
        if(numberTally==1) trueTally++;
        if(trueTally == 2) isTheHand = true;
        return isTheHand;
    }

    public boolean onePair(List<Card> hand){
        boolean isTheHand = false;
        int trueTally = 0;
        int falseTally = 0;
        int numberTally = 0;
        int prevScore = 0;
        for(int i=0;i<5;i++){
            Card card = hand.get(i);
            if(i==0){}
            else if(card.getScore()==prevScore){
                numberTally++;
                break;
            }
            else{
                falseTally++;
                if(falseTally == 4) break;
            }
            prevScore = card.getScore();
        }
        if(numberTally==1) trueTally++;
        if(trueTally >= 1) isTheHand = true;
        return isTheHand;
    }

    public boolean isStraightFlush(List<Card> hand){
        if(isStraight(hand)&&isFlush(hand)) return true;
        else return false;
    }

    public boolean isRoyalFlush(List<Card> hand){
        if(isRoyal(hand)&&isFlush(hand)) return true;
        else return false;
    }
}