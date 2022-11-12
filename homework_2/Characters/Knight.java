package Characters;

import Equipments.Armors.ArmorAbstract;
import Equipments.Weapons.WeaponAbstract;

public class Knight extends Heroes {
    public Knight(String name, int health, WeaponAbstract weapon, ArmorAbstract armor) {
        super(name, health, weapon, armor);
    }
}
