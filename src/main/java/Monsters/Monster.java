package Monsters;

public abstract class Monster {
    private int id;
    private String monsterName;
    private int damage;
    private int health;
    private int maxMonster;

    public Monster(int id, String monsterName, int damage, int health, int maxMonster) {
        this.id = id;
        this.monsterName = monsterName;
        this.damage = damage;
        this.health = health;
        this.maxMonster = maxMonster;
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

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
    
}
