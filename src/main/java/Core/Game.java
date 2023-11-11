package Core;

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

		System.out.println();
    }
}
