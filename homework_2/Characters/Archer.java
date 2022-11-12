package Characters;

import Equipments.Armors.Armor;
import Equipments.Weapons.WeaponAbstract;

public class Archer extends Heroes {
    public Archer(String name, int health, WeaponAbstract weapon, Armor armor) {
        super(name, health, weapon, armor);
    }
}
