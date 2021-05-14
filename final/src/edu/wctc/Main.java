package edu.wctc;

import java.util.Scanner;

public class Main {
    /**
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        Color C1;
        Color C2;
        System.out.println("This is a simplified version of Magic: The Gathering. In this simplification, the following changes occur\n" +
                "1) There are only two card types: Colored Monsters and Colored Lands. This means that instants, spells, and all artifacts are removed.\n" +
                "2) Decks are only of one color and are pre-made for you. You can't get multiple colors of Mana either.\n" +
                "3) Monsters don't have any special abilities. \n" +
                "   This means that walls can attack, there is no first strike, protection from one color, or flying, just to name a few.\n" +
                "4) There is only one main phase, which will be before the attack phase.\n" +
                "5) Monsters when played will consolidate their stats. An attack will remove attack stats and defense stats from the defender, but the defender will attack in retaliation.\n" +
                "6) There is no card in hand limit. This is normally 7.");
        System.out.println("This game is meant for two players, but you can feel free to play for both sides.");
        System.out.println("\nWhat will be the color for Player 1?\n" +
                "   1) Red\n" +
                "   2) Green\n" +
                "   3) Blue\n" +
                "   4) White\n" +
                "   5) Black");
        choice = sc.nextLine();
        switch (choice){
            case "1":
                C1 = Color.RED;
                break;
            case "2":
                C1 = Color.GREEN;
                break;
            case "3":
                C1 = Color.BLUE;
                break;
            case "4":
                C1 = Color.WHITE;
                break;
            case "5":
                C1 = Color.BLACK;
                break;
            default:
                System.out.println("That choice doesn't exist. Defaulted to Red");
                C1 = Color.RED;
                break;
        }
        System.out.println("\nWhat will be the color for Player 2?\n" +
                "   1) Red\n" +
                "   2) Green\n" +
                "   3) Blue\n" +
                "   4) White\n" +
                "   5) Black");
        choice = sc.nextLine();
        switch (choice){
            case "1":
                C2 = Color.RED;
                break;
            case "2":
                C2 = Color.GREEN;
                break;
            case "3":
                C2 = Color.BLUE;
                break;
            case "4":
                C2 = Color.WHITE;
                break;
            case "5":
                C2 = Color.BLACK;
                break;
            default:
                System.out.println("That choice doesn't exist. Defaulted to Blue");
                C2 = Color.BLUE;
                break;
        }
        Game game = new Game(C1, C2, sc);
    }
    //should ask player for one of five color decks
    //turn based
    //allow for one land to be played at a time
    //allow for several monsters to be played

//    THE FOLLOWING MUST BE ADDED FOR FULL FINAL CREDIT - Remove when added
//
//    GRASP / Encapsulation / SOLID
//    The Strategy Pattern
//    The Singleton Pattern
//    An Additional Pattern (10 points Extra)
//    Documented with JavaDoc
//    JUnit
//    Class Diagrams
}
