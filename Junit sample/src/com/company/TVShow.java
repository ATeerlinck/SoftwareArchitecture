package com.company;

public class TVShow {
    private String name;
    private int length;
    private boolean isItGood;

    public TVShow(String name, int length, boolean isItGood) {
        this.name = name;
        this.length = length;
        this.isItGood = isItGood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isItGood() {
        return isItGood;
    }

    public void setItGood(boolean itGood) {
        isItGood = itGood;
    }

    @Override
    public String toString() {
        return "TVShow{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", isItGood=" + isItGood +
                '}';
    }
}
