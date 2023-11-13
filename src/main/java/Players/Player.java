package Players;

import GameClasses.Archer;
import GameClasses.GameClass;
import GameClasses.Mage;
import GameClasses.Rogue;
import GameClasses.Warior;
import Settings.ColorSettings;
import Settings.GameSettings;

public class Player {
    private String playerName;
    private GameClass playerGameClass;
	private int playerDamage;
	private int playerHealth;
	private int playerMoney;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public GameClass getPlayerGameClass() {
        return playerGameClass;
    }

    public void setPlayerGameClass(GameClass playerGameClass) {
        this.playerGameClass = playerGameClass;
    }

    public int getPlayerDamage() {
		return playerDamage;
	}

	public void setPlayerDamage(int playerDamage) {
		this.playerDamage = playerDamage;
	}

	public int getPlayerHealth() {
		return playerHealth;
	}

	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}

	public int getPlayerMoney() {
		return playerMoney;
	}

	public void setPlayerMoney(int playerMoney) {
		this.playerMoney = playerMoney;
	}

	// Oyuncu karakter seçimi metodu
    public void selectGameClass() {
        GameSettings.align(37);
		GameSettings.title("Oyun Karakterleri");

        GameClass[] gameClassList = {
            new Rogue(),
            new Warior(),
            new Archer(),
            new Mage()
        };

        System.out.println(ColorSettings.PURPLE);
		GameSettings.align(36);
		System.out.printf("------------------------------------------%n");
		GameSettings.align(36);
		System.out.printf("| %-2s | %-12s | %4s | %4s |%4s |%n", "ID", "KARAKTER", "HASAR", "CAN", "PARA");
		GameSettings.align(36);
		System.out.printf("------------------------------------------%n");

        for (GameClass itemGameClass : gameClassList) {
			GameSettings.align(36);
			System.out.printf("| %-2s | %-12s | %4s  | %4s |%4s |%n", itemGameClass.getId(), itemGameClass.getGameClassName(), itemGameClass.getDamage(), itemGameClass.getHealth(), itemGameClass.getMoney());
		}

        System.out.println(ColorSettings.RESET);
		GameSettings.align(40);
		GameSettings.line();

        int selectGameClass;
        do {
            //GameSettings.input("Karakter Seçimi Yapınız: ");
			selectGameClass = 3; //GameSettings.inputScanner.nextInt();
			System.out.print(ColorSettings.RESET);
			switch (selectGameClass) {
				case 1:
					this.playerGameClass = gameClassList[0];
					break;
				case 2:
					this.playerGameClass = gameClassList[1];
					break;
				case 3:
					this.playerGameClass = gameClassList[2];
					break;
				case 4:
					this.playerGameClass = gameClassList[3];
					break;
				default:
					GameSettings.warningMessage("Geçersiz Karakter Seçimi Yaptınız!");
					break;
			}
			
			if (this.playerGameClass != null) {
				this.playerDamage = this.playerGameClass.getDamage();
				this.playerHealth = this.playerGameClass.getHealth();
				this.playerMoney = this.getPlayerGameClass().getMoney();
				break;
			}
        } while (true);

        System.out.print(ColorSettings.RESET);
		GameSettings.align(40);
		GameSettings.line();
		GameSettings.align(20);
		GameSettings.informationMessage("Seçim yaptığınız Karakter: " + playerGameClass.getGameClassName() + " Hasar: " + playerGameClass.getDamage() + " Can: " + playerGameClass.getHealth() + " Para: " + playerGameClass.getMoney());
		GameSettings.align(40);
		GameSettings.line();
    }
}
