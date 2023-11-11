package Core;

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
    }

    // Oyuncu rehberi
    public void about() {
        // Başlık
		System.out.println();
		GameSettings.align(47);
		System.out.println(ColorSettings.YELLOW_UNDERLINED + "### Oyun Rehberi ###" + ColorSettings.RESET);

		// Rehber
		System.out.println();
    }
}
