package edu.wctc;

/**
 * @params Name, Type, Color, attack, defense, cost
 */
public class MonsterCard extends Card{
    private int attack;
    private int defense;
    private int cost;

    public MonsterCard(String name, TypeStrategy type, Color color, int attack, int defense, int cost) {
        super(name, type, color);
        this.attack = attack;
        this.defense = defense;
        this.cost = cost;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +"; Cost: " + cost + "; " + getColor()+ " Attack/Defense: " + attack+"/"+defense;
    }
}
