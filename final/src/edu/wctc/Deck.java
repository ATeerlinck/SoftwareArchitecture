package edu.wctc;
/**
 * @param color
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private TypeStrategy land = new LandStrategy();
    private TypeStrategy monster = new MonsterStrategy();
    private String[] BlueNames= {"Island", "Merfolk of the Pearl Trident", "Water Mage", "Giant Tortise", "Water Elemental"};
    private String[] RedNames= {"Mountain", "Goblin Rogue", "Dragonkin Berserker", "Wall of Fire", "Fire Elemental"};
    private String[] GreenNames= {"Forest", "Killer bee", "Forest Spirit", "Wall of Brambles", "Tree Guardian"};
    private String[] WhiteNames= {"Plains", "Benalish Hero", "White Knight", "Castle Walls", "Serra Angel"};
    private String[] BlackNames= {"Swamp", "Will-o-Wisp", "Black Knight", "Bone Wall", "Sengir Vampire"};
    private List<Card> deck;

    public Deck(Color color) {
        switch (color) {
            case BLUE:
                this.deck = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    deck.add(new LandCard(BlueNames[0], land, color));
                }
                for (int i = 0; i < 13; i++) {
                    deck.add(new MonsterCard(BlueNames[1], monster, color, 1, 1, 1));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(BlueNames[2], monster, color, 2, 2, 2));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(BlueNames[3], monster, color, 1, 4, 2));
                }
                for (int i = 0; i < 7; i++) {
                    deck.add(new MonsterCard(BlueNames[4], monster, color, 4, 4, 4));
                }
                break;
            case RED:
                this.deck = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    deck.add(new LandCard(RedNames[0], land, color));
                }
                for (int i = 0; i < 13; i++) {
                    deck.add(new MonsterCard(RedNames[1], monster, color, 1, 1, 1));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(RedNames[2], monster, color, 2, 2, 2));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(RedNames[3], monster, color, 1, 4, 2));
                }
                for (int i = 0; i < 7; i++) {
                    deck.add(new MonsterCard(RedNames[4], monster, color, 4, 4, 1));
                }
                break;
            case GREEN:
                this.deck = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    deck.add(new LandCard(GreenNames[0], land, color));
                }
                for (int i = 0; i < 13; i++) {
                    deck.add(new MonsterCard(GreenNames[1], monster, color, 1, 1, 1));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(GreenNames[2], monster, color, 2, 2, 2));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(GreenNames[3], monster, color, 1, 4, 2));
                }
                for (int i = 0; i < 7; i++) {
                    deck.add(new MonsterCard(GreenNames[4], monster, color, 4, 4, 4));
                }
                break;
            case WHITE:
                this.deck = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    deck.add(new LandCard(WhiteNames[0], land, color));
                }
                for (int i = 0; i < 13; i++) {
                    deck.add(new MonsterCard(WhiteNames[1], monster, color, 1, 1, 1));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(WhiteNames[2], monster, color, 2, 2, 2));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(WhiteNames[3], monster, color, 1, 4, 2));
                }
                for (int i = 0; i < 7; i++) {
                    deck.add(new MonsterCard(WhiteNames[4], monster, color, 4, 4, 4));
                }
                break;
            case BLACK:
                this.deck = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    deck.add(new LandCard(BlackNames[0], land, color));
                }
                for (int i = 0; i < 13; i++) {
                    deck.add(new MonsterCard(BlackNames[1], monster, color, 1, 1, 1));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(BlackNames[2], monster, color, 2, 2, 2));
                }
                for (int i = 0; i < 8; i++) {
                    deck.add(new MonsterCard(BlackNames[3], monster, color, 1, 4, 2));
                }
                for (int i = 0; i < 7; i++) {
                    deck.add(new MonsterCard(BlackNames[4], monster, color, 4, 4, 4));
                }
                break;
        }
        Shuffle();
    }

    public void Shuffle(){
        List<Card> newDeck = new ArrayList<>();
        int size = this.deck.size();
        for(int x = 0; x<size; x++){
            Random rnd = new Random();
            int mover = rnd.nextInt(size-x);
            newDeck.add(this.deck.get(mover));
            this.deck.remove(mover);
        }
        this.deck = newDeck;
    }

    public Card Draw(){
        Card card = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        return card;
    }

    public static Deck getInstance(Color color){
        return new Deck(color);
    }

    public int getSize(){
        return deck.size();
    }
}
