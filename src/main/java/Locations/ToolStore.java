package Locations;

import Armors.Armor;
import Players.Player;
import Settings.ColorSettings;
import Settings.GameSettings;
import Weapons.Weapon;

public class ToolStore extends NormalLocation {

    public ToolStore(Player gamePlayer) {
        super(2, "Mağaza", gamePlayer);
    }

    public boolean onLocation() {
        do {
            GameSettings.align(44);
            GameSettings.title("Mağaza");

            System.out.println(ColorSettings.PURPLE);
            GameSettings.align(47);
            System.out.printf("---------------------%n");
            GameSettings.align(47);
            System.out.printf("| %-2s | %-12s |%n", "ID", "Kategori");
            GameSettings.align(47);
            System.out.printf("---------------------%n");

            GameSettings.align(47);
            System.out.printf("| %-2s | %-12s |%n", 1, "Silah");
            GameSettings.align(47);
            System.out.printf("| %-2s | %-12s |%n", 2, "Zırh");
            GameSettings.align(47);
            System.out.printf("| %-2s | %-12s |%n", 3, "Geri Dön");

            System.out.println();
            GameSettings.align(40);
            GameSettings.line();

            GameSettings.input("İşleminizi Seçin: ");
            int selectProcess = GameSettings.inputScanner.nextInt();
            System.out.print(ColorSettings.RESET);

            GameSettings.align(40);
            GameSettings.line();

            switch (selectProcess) {
            case 1:
                GameSettings.align(20);
                GameSettings.informationMessage("Seçilen işlem: Silah");
                GameSettings.align(40);
                GameSettings.line();

                Weapon.selectWeapon();
                break;
            case 2:
                GameSettings.align(20);
                GameSettings.informationMessage("Seçilen işlem: Zırh");
                GameSettings.align(40);
                GameSettings.line();

                Armor.selectArmor();
                break;
            case 3:
                GameSettings.align(20);
                GameSettings.informationMessage("Seçilen işlem: Geri Dön");
                GameSettings.align(40);
                GameSettings.line();
                break;
            default:
                GameSettings.warningMessage("Geçersiz bir değer girdiniz!");
                break;
            }

            if (selectProcess == 3) {
                break;
            }
        } while (true);

        return true;
    }
    
}
