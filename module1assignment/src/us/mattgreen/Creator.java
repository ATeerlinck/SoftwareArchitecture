package us.mattgreen;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Creator{
    
    public Creator(ArrayList<Talkable> zoo){
        System.out.println("What animal would you like to make?\n" +
            "1) Cat\n" +
            "2) Dog\n");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        try{
        if(answer.equals("1")){
            System.out.println("How many mice has your cat killed?");
            int kills = sc.nextInt();
            System.out.println("What is your cat's name?");
            String name = sc.nextLine();
            zoo.add(new Cat(kills, name));
        }
        if(answer.equals("2")){
            System.out.println("Is your dog friendly? y/n (defaults to y)");
            boolean friendly; 
            if(sc.nextLine().equalsIgnoreCase("n")){ friendly = false;} else {friendly = true;}
            System.out.println("What is your dog's name?");
            String name = sc.nextLine();
            zoo.add(new Dog(friendly, name));
        }
    }catch (Exception e){
        System.out.print(e.getMessage());
    }
        sc.close();
    };
    

}