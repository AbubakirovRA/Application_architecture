package Factories.WeaponFactories;

import Equipments.Weapons.WeaponAbstract;

public abstract class WeaponFactory {
    public abstract WeaponAbstract createWeapon(String weaponType);
}
