package edu.wctc.isp;

public interface Book extends Product{
    String getAuthor();
    int getPages();
    String getISBN();
}
