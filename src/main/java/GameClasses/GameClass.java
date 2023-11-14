package GameClasses;

public abstract class GameClass {
    private int id;
    private String gameClassName;
    private int damage;
    private int health;
    private int defence;
    private int money;

    public GameClass(int id, String gameClassName, int damage, int health, int defence, int money) {
        this.id = id;
        this.gameClassName = gameClassName;
        this.damage = damage;
        this.health = health;
        this.defence = defence;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameClassName() {
        return gameClassName;
    }

    public void setGameClassName(String gameClassName) {
        this.gameClassName = gameClassName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }    

    
}
