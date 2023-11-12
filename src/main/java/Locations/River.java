package Locations;

import Monsters.Vampire;
import Players.Player;

public class River extends BattleLocation {

    public River(Player gamePlayer) {
        super(3, "Nehir", gamePlayer, new Vampire());
    }

    public boolean onLocation() {
        return true;
    }
    
}
