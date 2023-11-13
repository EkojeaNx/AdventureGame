package Locations;

import Monsters.Bear;
import Players.Player;

public class Forest extends BattleLocation {

    public Forest(Player gamePlayer) {
        super(4, "Orman", gamePlayer, new Bear());
    }
    
}
