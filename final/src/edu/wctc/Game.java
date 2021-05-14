package edu.wctc;

import java.util.Scanner;

/**
 * @params Color1(C1), Color2(C2), Scanner (sc)
 */
public class Game {
    private Player P1;
    private Player P2;
    private int turn;
    private boolean playedLand = false;
    private Scanner sc;

    public Game(Color C1, Color C2, Scanner sc) {
        P1 = new Player(C1);
        P2 = new Player(C2);
        this.sc = sc;
        turn = 0;
        Play();
    }

    public void Play(){
        do{
            switch (turn%2){
                case 0:
                    System.out.println("Player 1's turn");
                    Turn(P1,P2);
                    
                    break;
                case 1:
                    System.out.println("Player 2's turn");
                    Turn(P2,P1);
                    break;
            }
            if(P1.getDeckSize()==0||P2.getDeckSize()==0)break;
            turn++;
        }while(P1.getLife()>=0||P2.getLife()>=0);
        if(P1.getLife()<=0||P1.getDeckSize()==0){
            System.out.println("Player 2 wins");
        } else System.out.println("Player 1 wins");
    }

    public void Turn(Player player, Player def){
        System.out.println("Current Life: "+player.getLife());
        playedLand = false;
        player.Draw();
        String choice = "";
        while(!choice.equals("0")) {
            System.out.println("Select a card to play. Enter 0 to enter the attack phase:");
            System.out.println("Current Mana: "+player.getMana());
            System.out.println("Current Attack: "+player.getAttack());
            System.out.println("Current Defense: "+player.getDefense());
            System.out.println(player.DisplayHand());
            choice = sc.nextLine();
            int sel = Integer.parseInt(choice);
            if(sel>0) {
                Card card = player.Play(sel - 1);
                switch (card.getType()) {
                    case "Land":
                        if (!playedLand) {
                            playedLand = true;
                            player.addMana(card);
                            player.useCard(sel-1);
                        } else System.out.println("You can not play two lands in one turn");
                        break;
                    case "Monster":
                        if (player.getMana() >= ((MonsterCard) card).getCost()) {
                            player.addStats((MonsterCard) card);
                            player.useMana(card);
                            player.useCard(sel-1);
                        } else System.out.println("You do not have the mana to play this card");
                        break;
                    default:
                        System.out.println("Error: Card type not found.");
                }
            }
        }
        player.newTurnMana();
        choice = "0";
            System.out.println("Enter 1 to attack. Enter 0 to end turn");
            choice = sc.nextLine();
            if(Integer.parseInt(choice)==1){
                if(def.getDefense()>0&&def.getAttack()>0){
                    int defAtt = def.getAttack();
                    int plAtt = player.getAttack();
                    def.loseDefense(plAtt);
                    def.loseAttack(plAtt);
                    player.loseAttack(defAtt);
                    player.loseDefense(defAtt);
                }
                else{
                    def.loseLife(player.getAttack());
                }
            }
            else{
                System.out.println("No attack was made. Passing to other player");
        }
    }

}
