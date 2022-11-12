package Characters;

import Equipments.Armors.Armor;
import Equipments.Weapons.WeaponAbstract;

public class Knight extends Heroes {
    public Knight(String name, int health, WeaponAbstract weapon, Armor armor) {
        super(name, health, weapon, armor);
    }
}
