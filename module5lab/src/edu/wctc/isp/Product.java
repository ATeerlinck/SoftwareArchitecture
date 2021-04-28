package edu.wctc.isp;

import java.time.LocalDate;

public interface Product {
    double getCost();
    LocalDate getReleaseDate();
    int getQuantityOnHand();
    String getTitle();
    String getFormattedReleaseDate();
    void order(int quantity);

}
