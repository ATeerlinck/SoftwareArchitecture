package edu.wctc;

/**
 * @params name, type, color
 */
public class LandCard extends Card{
    public LandCard(String name, TypeStrategy type, Color color) {
        super(name, type, color);
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Land: "+getName()+" ("+getColor()+")";
    }
}
