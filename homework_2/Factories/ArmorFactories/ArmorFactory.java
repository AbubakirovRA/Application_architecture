package Factories.ArmorFactories;

import Equipments.Armors.ArmorAbstract;

/**
 * ArmorFactory
 */
public abstract class  ArmorFactory {
    public abstract ArmorAbstract createArmor(String armorType);
}
