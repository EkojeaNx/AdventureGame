package Locations;

import Players.Player;
import Settings.GameSettings;

public class SafeHouse extends NormalLocation {

    public SafeHouse(Player gamePlayer) {
        super(1, "Güvenli Ev", gamePlayer);
    }

    public boolean onLocation() {
        GameSettings.align(40);
		GameSettings.title("Güvenli Bölge");
		
		System.out.println();
		GameSettings.align(40);
		GameSettings.informationMessage("Canınız yenilendi!");

        this.getGamePlayer().setPlayerHealth(this.getGamePlayer().getPlayerGameClass().getHealth());

        

        System.out.println();
		GameSettings.align(40);
		GameSettings.line();
        return true;
    }
    
}
