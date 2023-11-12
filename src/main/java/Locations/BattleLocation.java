package Locations;

import Monsters.Monster;
import Players.Player;
import Settings.ColorSettings;
import Settings.GameSettings;

public abstract class BattleLocation extends Location {
    private Monster battleMonster;
    private int maxMonster;

    public BattleLocation(int id, String locationName, int maxMonster, Player gamePlayer, Monster battleMonster) {
        super(id, locationName, gamePlayer);
        this.battleMonster = battleMonster;
        this.maxMonster = maxMonster;
    }

    public Monster getBattleMonster() {
        return battleMonster;
    }

    public void setBattleMonster(Monster battleMonster) {
        this.battleMonster = battleMonster;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monsterNumber = randomMonster();
        String selectWarfare;

        GameSettings.align(20);
        GameSettings.warningMessage("Dikkatli Olun!!!\n" 
        + this.getLocationName() + " Bölgesine giriş yaptınız!\n"
        + "Bu bölgede " + monsterNumber + " adet " + this.getBattleMonster().getMonsterName() + " canavarı mevcut.\n"
        + "Canavarlar her an saldırabilir.");

        System.out.println();
        GameSettings.align(40);
        GameSettings.line();

        GameSettings.input("<S>avaş veya <K>aç : ");
		selectWarfare = GameSettings.inputScanner.nextLine();
		System.out.print(ColorSettings.RESET);

        GameSettings.align(40);
        GameSettings.line();
        
        if (selectWarfare.equals("S")) {
            GameSettings.informationMessage("Savaş olacak");
        }

        return true;
    }

    public void warfare() {

    }

    public int randomMonster() {
        return GameSettings.randomNumberGenerator.nextInt(this.getMaxMonster()) + 1;
    }

}
