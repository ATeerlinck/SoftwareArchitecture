package edu.wctc;

/**
 *
 */
public class Mana {
    private int blue;
    private int red;
    private int green;
    private int white;
    private int black;

    public Mana() {
        blue = 0;
        red = 0;
        green = 0;
        white = 0;
        black = 0;
    }

    public int getMana(){
        return blue+red+green+white+black;
    }

    public int getBlue() {
        return blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getWhite() {
        return white;
    }

    public int getBlack() {
        return black;
    }

    public void addMana(Card card){
        Color color = card.getColor();
        switch(color) {
            case BLUE:
                blue++;
                break;
            case RED:
                red++;
                break;
            case GREEN:
                green++;
                break;
            case WHITE:
                white++;
                break;
            case BLACK:
                black++;
                break;
        }
    }

    public void useMana(Card card){
        Color color = card.getColor();
        int cost = ((MonsterCard) card).getCost();
        switch(color) {
            case BLUE:
                blue-=cost;
                break;
            case RED:
                red-=cost;
                break;
            case GREEN:
                green-=cost;
                break;
            case WHITE:
                white-=cost;
                break;
            case BLACK:
                black-=cost;
                break;
        }
    }

    public void restoreMana(Mana mana){
        red = mana.getRed();
        blue = mana.getBlue();
        green = mana.getGreen();
        black = mana.getBlack();
        white = mana.getWhite();
    }
//can't mana burn
//player mana and maximum allowed mana separated?
}
