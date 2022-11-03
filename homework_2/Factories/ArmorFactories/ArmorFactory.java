package Factories.ArmorFactories;

import Equipments.Armors.Armor;

/**
 * ArmorFactory
 */
public abstract class  ArmorFactory {
    public abstract Armor createArmor(String armorType);
}
