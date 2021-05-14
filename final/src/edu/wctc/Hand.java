package edu.wctc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Hand {

    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public void Discard(int sel){
        hand.remove(sel);
    }

    public String Display(){
        String disp = "";
        int count = 1;
        for(Card card : hand){

            disp += count+") "+card.toString()+"\n";
            count++;
        }
        if(hand.size()==0){
            disp = "Your hand is empty";
        }
        return disp;
    }

    public Card Play(int sel){
       Card card = hand.get(sel);
       return card;
    }

    public void useCard(int sel){
        hand.remove(sel);
    }

    public int getSize(){
        return hand.size();
    }

}
