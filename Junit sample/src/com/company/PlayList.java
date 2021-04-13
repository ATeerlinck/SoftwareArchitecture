package com.company;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    List<TVShow> playList = new ArrayList<>();

    public PlayList() {
        playList.add(new TVShow("You", 60, true));
        playList.add(new TVShow("Nailed It", 30, false));
        playList.add(new TVShow("Cobra Kia", 60, true));
        playList.add(new TVShow("Curon", 60, true));
    }

    public int getLengthFromName(String name) {
        for (TVShow show : playList) {
            if (show.getName().equals(name)) {
                return show.getLength();
            }
        }
        return 0;
    }
    public boolean getIsITGoodFromName(String name) {
        for (TVShow show : playList) {
            if (show.getName().equals(name)) {
                return show.isItGood();
            }
        }
        return false;
    }
    public String getPlayList() {
        String theList = "";
        for (TVShow show: playList) {
            theList += show + "\n";
        }
        return theList;
    }

}
