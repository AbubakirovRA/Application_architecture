package Characters;

import Equipments.Armors.Armor;
import Equipments.Weapons.Weapon;
/**
 * Heroes basic abstract class
 */
public abstract class Heroes {
    protected String name;
    protected int hp;
    protected Weapon weapon;
    protected Armor armor;

    public Heroes(String name, int hp, Weapon weapon, Armor armor) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getCharInfoString(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Name:").append(name).append("\n")
                 .append("HP:").append(hp).append("\n")
                 .append("Weapon:").append(weapon.getName()).append("\n")
                 .append("Armor:").append(armor.getName())
                 .toString();
    }
}