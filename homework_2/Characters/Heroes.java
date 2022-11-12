package Characters;

import Equipments.Armors.Armor;
import Equipments.Weapons.WeaponAbstract;
/**
 * Heroes basic abstract class
 */
public abstract class Heroes {
    protected String name;
    protected int health;
    protected WeaponAbstract weapon;
    protected Armor armor;

    public Heroes(String name, int health, WeaponAbstract weapon, Armor armor) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getTotalInfo(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Hero: ").append(name).append(", ")
                 .append("Health level: ").append(health).append(";\n")
                 .append("Weapon: ").append(weapon.getName()).append(", ")
                 .append("Armor: ").append(armor.getName()).append(";")
                 .toString();
    }
}