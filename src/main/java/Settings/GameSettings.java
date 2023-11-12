package Settings;

import java.util.Random;
import java.util.Scanner;

public abstract class GameSettings {
    // Oyuncudan veri alma kütüphanesi
	public static Scanner inputScanner = new Scanner(System.in);
	
	// Rastgele sayı üretme
	public static Random randomNumberGenerator = new Random();
	
	// Başlık
	public static void title(String text) {
		System.out.println(ColorSettings.BLUE + "########## " + ColorSettings.RESET + ColorSettings.GREEN_UNDERLINED + text.toUpperCase() + ColorSettings.RESET +
				ColorSettings.BLUE + " ##########" + ColorSettings.RESET);
	}
	
	// Ayraç
	public static void line() {
		System.out.println(ColorSettings.RED + "----------------------------------" + ColorSettings.RESET);		
	}
	
	// Veri alma
	public static void input(String text) {
		System.out.print(ColorSettings.YELLOW + "# " + text + ColorSettings.RESET + ColorSettings.GREEN_BOLD);
	}
	
	// Mesaj
	public static void article(String text) {
		System.out.println(ColorSettings.YELLOW + "$ " + ColorSettings.RESET + ColorSettings.GREEN + text + ColorSettings.RESET);
	}
	
	// Bilgilendirme Mesajı
	public static void informationMessage(String text) {
		System.out.println(ColorSettings.YELLOW + "> " + ColorSettings.RESET + ColorSettings.GREEN_BRIGHT + text + ColorSettings.RESET);
	}
	
	// Hata Bilgilendirme Mesajı
	public static void warningMessage(String text) {
		System.out.println();
		System.out.println(ColorSettings.RED_BACKGROUND + text + ColorSettings.RESET);
		System.out.println();
	}
	
	// Hizalama
	public static void align(Integer rate) {
		System.out.printf("%" + rate.toString() + "s", "");
	}
}
