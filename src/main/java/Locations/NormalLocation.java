package Locations;

import Players.Player;

public abstract class NormalLocation extends Location {

    public NormalLocation(int id, String locationName, Player gamePlayer) {
        super(id, locationName, gamePlayer);
    }

    public boolean onLocation() {
        return true;
    }
    
}
