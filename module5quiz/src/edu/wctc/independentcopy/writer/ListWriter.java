package edu.wctc.independentcopy.writer;

public class ListWriter implements Writer{
    @Override
    public void writeln(String line) {
        System.out.println("Here is the text from the last exercise:");
        System.out.println(line);
    }
}
