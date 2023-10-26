package AdvantureGame;

public  abstract class  GameChar {
    private int id;
    private String name;
    private int damage;
    private int healty;
    private int money;

    public GameChar(int id,String name,int damage, int healty, int money) {
        this.id = id;
        this.name=name;
        this.damage = damage;
        this.healty = healty;
        this.money = money;
    }

    public int getDamage() {
        return damage;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
