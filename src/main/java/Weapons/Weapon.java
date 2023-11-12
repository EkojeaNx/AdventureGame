package Weapons;

import Settings.ColorSettings;
import Settings.GameSettings;

public abstract class Weapon {
    private int id;
    private String weaponName;
    private int damage;
    private int money;

    public Weapon(int id, String weaponName, int damage, int money) {
        this.id = id;
        this.weaponName = weaponName;
        this.damage = damage;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
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

    public static Weapon selectWeapon() {
        GameSettings.align(42);
		GameSettings.title("Silahlar");
		
		Weapon selectInitWeapon = null;

        Weapon[] weaponList = {
            new Knife(),
            new Sword(),
            new Bow(),
            new Staff()
        };

        System.out.println(ColorSettings.PURPLE);
		
		GameSettings.align(40);
		System.out.printf("-----------------------------------%n");
		GameSettings.align(40);
		System.out.printf("| %-2s | %-12s | %4s |%4s |%n", "ID", "Silah", "HASAR", "PARA");
		GameSettings.align(40);
		System.out.printf("-----------------------------------%n");

		for (Weapon itemWeapon : weaponList) {
			GameSettings.align(40);
			System.out.printf("| %-2s | %-12s |  %4s |%4s |%n", itemWeapon.getId(), itemWeapon.getWeaponName(),
					itemWeapon.getDamage(), itemWeapon.getMoney());
		}
		
		GameSettings.align(40);
		System.out.printf("| %-2s | %-12s |  %4s |%4s |%n", weaponList.length + 1, "Geri Dön",
				"", "");

		System.out.println(ColorSettings.RESET);
		GameSettings.align(40);
		GameSettings.line();

        GameSettings.input("Silahınızı Seçin: ");
		int selectWeapon = GameSettings.inputScanner.nextInt();
		System.out.print(ColorSettings.RESET);

		switch (selectWeapon) {
		case 1:
			selectInitWeapon = weaponList[0];
			break;
		case 2:
			selectInitWeapon = weaponList[1];
			break;
		case 3:
			selectInitWeapon = weaponList[2];
			break;
		case 4:
			selectInitWeapon = weaponList[3];
			break;
		case 5:
			GameSettings.align(20);
			GameSettings.informationMessage("Geri Dönüyorsunuz!");
			break;
		default:
			GameSettings.warningMessage("Geçersiz değer girdiniz zorunlu geri yönleniyorsunuz!");
			break;
		}
		

        return selectInitWeapon;
    } 
}
