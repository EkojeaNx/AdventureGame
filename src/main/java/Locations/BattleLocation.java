package Locations;

import Monsters.Monster;
import Players.Player;

public abstract class BattleLocation extends Location {
    private Monster battleMonster;

    public BattleLocation(int id, String locationName, Player gamePlayer, Monster battleMonster) {
        super(id, locationName, gamePlayer);
        this.battleMonster = battleMonster;
    }

    public Monster getBattleMonster() {
        return battleMonster;
    }

    public void setBattleMonster(Monster battleMonster) {
        this.battleMonster = battleMonster;
    }

    public boolean onLocation() {
        return true;
    }

    public void warfare() {

    }
}
