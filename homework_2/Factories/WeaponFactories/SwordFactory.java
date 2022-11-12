package Factories.WeaponFactories;

import Equipments.Weapons.GoodSword;
import Equipments.Weapons.BadSword;
import Equipments.Weapons.SimpleSword;

public class SwordFactory extends WeaponFactory{

    private static SwordFactory instance;

    private SwordFactory(){};

    public static SwordFactory runFactory(){
        return instance == null ? new SwordFactory() : instance;
    };

    @Override
    public SimpleSword createWeapon(String weaponType) {
        if (weaponType.equalsIgnoreCase("BadSword")) {return new BadSword("Bad Sword", 2);}
        if (weaponType.equalsIgnoreCase("GoodSword")) {return new GoodSword("Good Sword", 5);}
        
        return null;
    }
    
}
