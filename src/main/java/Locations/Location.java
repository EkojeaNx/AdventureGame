package Locations;

import Players.Player;

public abstract class Location {
    private int id;
    private String locationName;
    private Player gamePlayer;

    public Location(int id, String locationName, Player gamePlayer) {
        this.id = id;
        this.locationName = locationName;
        this.gamePlayer = gamePlayer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Player getGamePlayer() {
        return gamePlayer;
    }

    public void setGamePlayer(Player gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public abstract boolean onLocation();
}
