package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader{
    @Override
    public String readln() {
        List prev = new ArrayList<>();
        prev.add("Here is a jumbled mess");
        prev.add("siufebaerjgbakdjg");
        prev.add("Enjoy!");
        return prev.toString();
    }
}
