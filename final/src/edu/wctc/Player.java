package edu.wctc;

/**
 * @params color
 */
public class Player {
    private Hand hand;
    private Mana mana;
    private Mana lands;
    private Deck deck;
    private int life;
    private int defense;
    private int attack;

    public Player(Color color){
        hand = new Hand();
        lands = new Mana();
        mana = new Mana();
        deck = Deck.getInstance(color);
        life = 20;
        attack = 0;
        defense = 0;
        Shuffle();
        Draw();
        Draw();
        Draw();
        Draw();
        Draw();
        Draw();
        Draw();
    }

    public void Draw(){
        Card card = deck.Draw();
        hand.addCard(card);
    }

    public void Shuffle(){
        deck.Shuffle();
    }

    public int getLife() {
        return life;
    }

    public void loseLife(int loss){
        life-=loss;
    }

    public String DisplayHand(){
        return hand.Display();
    }

    public Card Play(int card){
        return hand.Play(card);
    }

    public void addMana(Card card){
        lands.addMana(card);
        mana.addMana(card);
    }
    public void newTurnMana(){
        mana.restoreMana(lands);
    }

    public int getMana(){
        return mana.getMana();
    }

    public void loseDefense(int defense) {
        this.defense -= defense;
        if(this.defense<0) this.defense = 0;
    }

    public void loseAttack(int attack) {
        this.attack -= attack;
        if(this.attack<0) this.attack = 0;
    }

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public void addStats(MonsterCard card){
        attack+=card.getAttack();
        defense+=card.getDefense();
    }

    public void useMana(Card card){
        mana.useMana(card);
    }

    public void useCard(int sel){
        hand.useCard(sel);
    }

    public int getDeckSize(){
        return deck.getSize();
    }

    public int getHandSize(){
        return hand.getSize();
    }

    public Deck getDeck(){
        return deck;
    }
}
