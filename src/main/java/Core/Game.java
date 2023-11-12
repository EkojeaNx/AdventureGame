package Core;

import Locations.Cave;
import Locations.Forest;
import Locations.Location;
import Locations.River;
import Locations.SafeHouse;
import Locations.ToolStore;
import Players.Player;
import Settings.ColorSettings;
import Settings.GameSettings;

public class Game {
    // Oyunu başlatan metot
    public void start() {
        // Başlık
		GameSettings.align(40);
		GameSettings.title("Macera Oyunu");
		GameSettings.align(40);
		GameSettings.line();

        // Oyuncu rehberi
		about();

        // Oyuncu Oluşturma
        String playerName;
        do {
            GameSettings.input("Oyuncu Adını Giriniz: ");
			playerName = GameSettings.inputScanner.nextLine();
			System.out.print(ColorSettings.RESET);

			playerName = playerName.toString().trim();

			if (!playerName.isEmpty()) {
				if (playerName.length() > 5) {
					break;
				} else {
					GameSettings.warningMessage("Oyuncu adı 6 haneden az olamaz!");
				}
			} else {
				GameSettings.warningMessage("Oyuncu adı boş bırakılamaz!");
			}
        } while (true);

        Player gamePlayer = new Player(playerName);

        System.out.println();
		GameSettings.align(20);
		System.out.println(ColorSettings.WHITE_BOLD + "Bu puslu ve macera dolu oyuna Hoş Geldin " + ColorSettings.RESET
				+ ColorSettings.CYAN_BOLD_BRIGHT + gamePlayer.getPlayerName() + ColorSettings.RESET);

		System.out.println();

        // Oyuncu karakter seçimi metodu
        gamePlayer.selectGameClass();

        // Bölge işlemleri
        Location playerLocation = null;
        int selectLocation = 0;

        Location[] locationList = {
            new SafeHouse(gamePlayer),
            new ToolStore(gamePlayer),
            new River(gamePlayer),
            new Forest(gamePlayer),
            new Cave(gamePlayer)
        };

        do {
            GameSettings.align(42);
			GameSettings.title("Bölgeler");

			System.out.println(ColorSettings.PURPLE);
			GameSettings.align(46);
			System.out.printf("---------------------%n");
			GameSettings.align(46);
			System.out.printf("| %-2s | %-12s |%n", "ID", "Bölge");
			GameSettings.align(46);
			System.out.printf("---------------------%n");

            for (Location itemLocation : locationList) {
				GameSettings.align(46);
				System.out.printf("| %-2s | %-12s |%n", itemLocation.getId(), itemLocation.getLocationName());
			}
			GameSettings.align(46);
			System.out.printf("| %-2s | %-12s |%n", locationList.length + 1, "Çıkış");

			System.out.println(ColorSettings.RESET);

			GameSettings.align(40);
			GameSettings.line();

            GameSettings.input("Bölge Seç: ");
			selectLocation = GameSettings.inputScanner.nextInt();
			System.out.print(ColorSettings.RESET);

            switch (selectLocation) {
                case 1:
                    playerLocation = locationList[0];
                    break;
                case 2:
                    playerLocation = locationList[1];
                    break;
                case 3:
                    playerLocation = locationList[2];
                    break;
                case 4:
                    playerLocation = locationList[3];
                    break;
                case 5:
                    playerLocation = locationList[4];
                    break;
                case 6:
                    GameSettings
                            .informationMessage("Oyun Kapanıyor!!! Oyuna tekrar bekleriz sayın " + gamePlayer.getPlayerName());
                    System.exit(0);
                    break;
                default:
                    GameSettings.warningMessage("Geçersiz bölge bilgisi verildi!");
                    break;
                }
    
                if (playerLocation != null) {
                    GameSettings.align(40);
                    GameSettings.line();
                    GameSettings.align(20);
                    GameSettings.informationMessage("Seçilen bölge: " + playerLocation.getLocationName());
                    GameSettings.align(40);
                    GameSettings.line();
    
                    playerLocation.onLocation();
                }
    
                selectLocation = 0;
                playerLocation = null;
    
                if (selectLocation == locationList.length + 1) {
                    break;
                }    
        } while (true);
    }

    // Oyuncu rehberi
    public void about() {
        // Başlık
		System.out.println();
		GameSettings.align(47);
		System.out.println(ColorSettings.YELLOW_UNDERLINED + "### Oyun Rehberi ###" + ColorSettings.RESET);

		// Rehber
		System.out.println();

        GameSettings.align(20);
		GameSettings.article("Oyuna başladığınızda oyuncu ismi giriyorsunuz.");
		GameSettings.align(20);
		GameSettings.article("Oyuncu isminiz boş ve 6 haneden küçük olmamalı.");
        GameSettings.align(20);
		GameSettings.article("Karakter sınıfları karşınıza liste halinde çıkıyor ve oyuncu sınıfınızı seçiyorsunuz. ");
		GameSettings.align(20);
		GameSettings.article(
				"Karakter sınıfı seçiminiz belirlenen id'lerden biri olmazsa tekrar seçim yapmanız bekleniyor.");
		GameSettings.align(20);
        GameSettings.article("Bölgeler liste halinde karşınıza çıkıyor.");
		GameSettings.align(20);
		GameSettings.article("Bölge seçimi geçersiz değer olduğunda tekrar seçim sağlamanız bekleniyor.");
		GameSettings.align(20);
		GameSettings.article("Güvenli Ev'de canınızı yenileyebilirsiniz.");
		GameSettings.align(20);
        GameSettings.article("Mağaza'da Silah ve Zırh alıp daha üst seviye canavarları yok edip ödüller alabilirsin.");

		System.out.println();
    }
}
