package Factories.Character_Factories_Abstact;

import Characters.Knight;
import Equipments.Armors.Platemail;
import Equipments.Weapons.Sword;
import Factories.ArmorFactories.PlateFactory;
import Factories.WeaponFactories.SwordFactory;

/**
 * KnightFactory (singleton) - to make only one factory ever exist, whenever some one want to get one
 */
public class KnightFactory implements CharacterFactory<Knight>{

    private static KnightFactory instance;

    private KnightFactory(){};

    public static KnightFactory getFactory(){
        return instance == null ? new KnightFactory() : instance;
    };

    @Override
    public Knight CreateCharater(String name,  String weaponName, String armorName) {
        return new Knight(name, 35, makeWeapon(weaponName), makeArmor(armorName));
    };

    private Platemail makeArmor(String armorName){
        return PlateFactory.getFactory().createArmor(armorName);
    };

    private Sword makeWeapon(String weaponName){
        return SwordFactory.getFactory().createWeapon(weaponName);
    }
}
