package Characters;

import Equipments.Armors.ArmorAbstract;
import Equipments.Weapons.WeaponAbstract;

public class Archer extends Heroes {
    public Archer(String name, int health, WeaponAbstract weapon, ArmorAbstract armor) {
        super(name, health, weapon, armor);
    }
}
