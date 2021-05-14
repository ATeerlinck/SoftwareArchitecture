package edu.wctc;

/**
 * @params name, type, color
 */
public class Card {
    private String name;
    private TypeStrategy type;
    private Color color;

    public Card(String name, TypeStrategy type, Color color) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type.getType();
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Card Drawn:" +
                "Name: " + name +
                ", Type:" + getType() +
                ", Color:" + color ;
    }

    //cards should only require mana of one color
    //cards can only be land or monster

//monster cards
    //should have attack and defense
    //special attributes? flying and first strike?

}
