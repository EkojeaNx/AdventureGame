package Monsters;

public abstract class Monster {
    private int id;
    private String monsterName;
    private int damage;
    private int health;

    public Monster(int id, String monsterName, int damage, int health) {
        this.id = id;
        this.monsterName = monsterName;
        this.damage = damage;
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
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

    
}
