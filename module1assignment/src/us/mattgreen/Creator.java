package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class Creator{

    ArrayList<Talkable> zoo = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public Creator(ArrayList<Talkable> zoo){
        this.zoo = zoo;
        addNewAnimal(this.zoo);
    }

    public void addNewAnimal(ArrayList<Talkable> zoo){
        System.out.println("What animal would you like to make?\n" +
            "1) Cat\n" +
            "2) Dog");
        String answer = sc.nextLine();
        try{
            if(answer.equals("1")){
                System.out.println("How many mice has your cat killed?");
                int kills = sc.nextInt();
                sc.nextLine();
                System.out.println("What is your cat's name?");
                String name = sc.nextLine();
                zoo.add(new Cat(kills, name));
                System.out.println("Your Cat has been added.");
            }
            if(answer.equals("2")){
                System.out.println("Is your dog friendly? y/n (defaults to y)");
                boolean friendly; 
                if(sc.nextLine().equalsIgnoreCase("n")){ friendly = false;} else {friendly = true;}
                System.out.println("What is your dog's name?");
                String name = sc.nextLine();
                zoo.add(new Dog(friendly, name));
                System.out.println("Your Dog has been added.");
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    };
    

}