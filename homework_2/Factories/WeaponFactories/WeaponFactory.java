package Factories.WeaponFactories;

import Equipments.Weapons.Weapon;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon(String weaponType);
}
