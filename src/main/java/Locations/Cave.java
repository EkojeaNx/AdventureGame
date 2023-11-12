package Locations;

import Monsters.Zombie;
import Players.Player;

public class Cave extends BattleLocation {

    public Cave(Player gamePlayer) {
        super(5, "Mağara", 5, gamePlayer, new Zombie());
    }
    
}
