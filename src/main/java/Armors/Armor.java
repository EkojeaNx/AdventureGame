package Armors;

import Settings.ColorSettings;
import Settings.GameSettings;

public abstract class Armor {
    private int id;
    private String armorName;
    private int damage;
    private int money;

    public Armor(int id, String armorName, int damage, int money) {
        this.id = id;
        this.armorName = armorName;
        this.damage = damage;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public static Armor selectArmor() {
        GameSettings.align(42);
		GameSettings.title("Zırhlar");
		
		Armor selectInitArmor = null;

        Armor[] armorList = {
            new Helmet(),
            new Garment(),
            new Pants(),
            new Gauntlet(),
            new Boot()
        };

        System.out.println(ColorSettings.PURPLE);
		
		GameSettings.align(40);
		System.out.printf("-----------------------------------%n");
		GameSettings.align(40);
		System.out.printf("| %-2s | %-12s | %4s |%4s |%n", "ID", "Zırh", "HASAR", "PARA");
		GameSettings.align(40);
		System.out.printf("-----------------------------------%n");

		for (Armor itemWeapon : armorList) {
			GameSettings.align(40);
			System.out.printf("| %-2s | %-12s |  %4s |%4s |%n", itemWeapon.getId(), itemWeapon.getArmorName(),
					itemWeapon.getDamage(), itemWeapon.getMoney());
		}
		
		GameSettings.align(40);
		System.out.printf("| %-2s | %-12s |  %4s |%4s |%n", armorList.length + 1, "Geri Dön",
				"", "");

		System.out.println(ColorSettings.RESET);
		GameSettings.align(40);
		GameSettings.line();

        GameSettings.input("Silahınızı Seçin: ");
		int selectWeapon = GameSettings.inputScanner.nextInt();
		System.out.print(ColorSettings.RESET);

		switch (selectWeapon) {
		case 1:
			selectInitArmor = armorList[0];
			break;
		case 2:
			selectInitArmor = armorList[1];
			break;
		case 3:
			selectInitArmor = armorList[2];
			break;
		case 4:
			selectInitArmor = armorList[3];
			break;
		case 5:
			selectInitArmor = armorList[4];
			break;
		case 6:
			GameSettings.align(20);
			GameSettings.informationMessage("Geri Dönüyorsunuz!");
			break;
		default:
			GameSettings.warningMessage("Geçersiz değer girdiniz zorunlu geri yönleniyorsunuz!");
			break;
		}

        return selectInitArmor;
    }
}
