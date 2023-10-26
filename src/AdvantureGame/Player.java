package AdvantureGame;

import java.util.Scanner;

public class Player {
    private int damage;
    private int healty;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;

    private Scanner input = new Scanner(System.in);

    public Player(String name){
        this.name= name;
        this.inventory= new Inventory();
    }

    public void prinfİnfo(){
        System.out.println(
                "\t damage: " + this.getInventory().getWeapon().getName() +
                "\t healty: " + this.getHealty()+
                "\t damage: " +this.getDamage()+
                "\t money: " +this.getMoney());
    }

    public void selectedChar(){
        GameChar[] characterList = {new Samurai(),new Knight(), new Archer()};
        System.out.println("karakterler");
        System.out.println("-----------------------------");
        for(GameChar character : characterList){
            System.out.println("id: " + character.getId() +
                    "\tkarakter: " +character.getName() + "-->" +
                    "\t damage: " + character.getDamage() +
                    "\t healty: " + character.getHealty()+
                    "\t money: " +character.getMoney());
        }

        System.out.println("-------------------------------");
        System.out.print("lütfen karakter seçiniz: ");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
            case 3:
                initPlayer(new Archer());
                break;
            default:
                initPlayer(new Samurai());

        }
        System.out.println("seçilen karakter: " + this.getCharName());
    }




    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealty(gameChar.getHealty());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public int getDamage() {
        return damage+ this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }
    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
}
