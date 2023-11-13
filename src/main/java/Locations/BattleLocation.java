package Locations;

import Monsters.Monster;
import Players.Player;
import Settings.ColorSettings;
import Settings.GameSettings;

public abstract class BattleLocation extends Location {
    private Monster battleMonster;
    private int monsterNumber;

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

    public int getMonsterNumber() {
        return monsterNumber;
    }

    public void setMonsterNumber(int monsterNumber) {
        this.monsterNumber = monsterNumber;
    }
    

    @Override
    public boolean onLocation() {
        String selectWarfare;
        this.setMonsterNumber(randomMonster());
        GameSettings.align(20);
        GameSettings.warningMessage("Dikkatli Olun!!! " 
        + this.getLocationName() + " Bölgesine giriş yaptınız! "
        + "Bu bölgede " + this.getMonsterNumber() + " adet " + this.getBattleMonster().getMonsterName() + " canavarı mevcut. "
        + "Canavarlar harekete geçmeden önce durumunu belirlemelisin.");

        GameSettings.align(40);
        GameSettings.line();

        GameSettings.input("<S>avaş veya <K>aç Durumunuzu belirtin : ");
		selectWarfare = GameSettings.inputScanner.next().toUpperCase();
		System.out.print(ColorSettings.RESET);

        GameSettings.align(40);
        GameSettings.line();
        
        if (selectWarfare.equals("S")) {
            GameSettings.align(20);
            GameSettings.informationMessage("Durumunuzu savaş olarak seçtiniz!");

            GameSettings.align(40);
            GameSettings.line();

            warfare();


        } else {
            GameSettings.informationMessage("Savaştan kaçınıldı.");
        }

        return true;
    }

    public void playerInformation() {
        GameSettings.align(40);
        GameSettings.title("Değerleriniz");
        System.out.println("Hasar: " + this.getGamePlayer().getPlayerDamage());
        System.out.println("Can: " + this.getGamePlayer().getPlayerHealth());
        System.out.println("Para: " + this.getGamePlayer().getPlayerMoney());

        System.out.println();
        GameSettings.align(40);
        GameSettings.line();
    }

    public void monsterInformation() {
        GameSettings.align(36);
        GameSettings.title(this.getBattleMonster().getMonsterName() + " Canavarının Değerleri");
        System.out.println("Hasar: " + this.getBattleMonster().getDamage());
        System.out.println("Can: " + this.getBattleMonster().getHealth());

        System.out.println();
        GameSettings.align(40);
        GameSettings.line();
    }

    public boolean warfare() {
        String selectProcess;
        for (int i = 0; i < this.getMonsterNumber(); i++) {
            playerInformation();
            monsterInformation();
            
            while (this.getGamePlayer().getPlayerHealth() > 0 && this.getBattleMonster().getHealth() > 0) {
                
                GameSettings.align(40);
                GameSettings.line();

                GameSettings.input("<V>ur veya <B>lokla Durumunuzu belirtin : ");
		        selectProcess = GameSettings.inputScanner.next().toUpperCase();
		        System.out.print(ColorSettings.RESET);

                GameSettings.align(40);
                GameSettings.line();
            }

            System.out.println(this.getMonsterNumber());
        }
        return false;
    }

    public int randomMonster() {
        return GameSettings.randomNumberGenerator.nextInt(this.getBattleMonster().getMaxMonster()) + 1;
    }

}
