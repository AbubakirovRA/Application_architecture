package Factories.Character_Factories_Abstact;

import Characters.Archer;
import Equipments.Armors.Chainmail;
import Equipments.Weapons.Bow;
import Factories.ArmorFactories.MailFactory;
import Factories.WeaponFactories.BowFactory;

/**
 * ArcherFactory (singleton) - to make only one factory ever exist, whenever some one want to get one
 */
public class ArcherFactory implements CharacterFactory<Archer>{

    private static ArcherFactory instance;

    private ArcherFactory(){};

    public static ArcherFactory getFactory(){
        return instance == null ? new ArcherFactory() : instance;
    };

    
    @Override
    
    public Archer CreateCharater(String name, String weaponName, String armorName) {
        return new Archer(name, 15, makeWeapon(weaponName), makeArmor(armorName));
    };

    private Chainmail makeArmor(String armorName){
        return MailFactory.getFactory().createArmor(armorName);
    };

    private Bow makeWeapon(String weaponName){
        return BowFactory.getFactory().createWeapon(weaponName);
    }
}