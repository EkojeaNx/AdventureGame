package Locations;

import Monsters.Zombie;
import Players.Player;

public class Cave extends BattleLocation {

    public Cave(Player gamePlayer) {
        super(5, "Mağara", gamePlayer, new Zombie());
    }

    public boolean onLocation() {
        return true;
    }
    
}
