package edu.wctc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void draw() {
       Player player = new Player(Color.WHITE);
       int first = player.getHandSize();
       player.Draw();
        assertEquals(first+1, player.getHandSize());
    }

    @Test
    void shuffle() {
        Player player = new Player(Color.WHITE);
        player.Shuffle();
        Deck deck = new Deck(Color.WHITE);
        assertNotEquals(deck,player.getDeck());
    }

    @Test
    void displayHand() {
        Player player = new Player(Color.WHITE);
        String disp = player.DisplayHand();
        System.out.println(disp);
        assertNotSame(null, disp);
    }
}