package Factories.WeaponFactories;

import Equipments.Weapons.BadBow;
import Equipments.Weapons.SimpleBow;
import Equipments.Weapons.GoodBow;

public class BowFactory extends WeaponFactory{

    private static BowFactory instance;

    private BowFactory(){};

    public static BowFactory runFactory(){
        return instance == null ? new BowFactory() : instance;
    };

    @Override
    public SimpleBow createWeapon(String weaponType) {
        if (weaponType.equalsIgnoreCase("BadBow")) {return new BadBow("Bad Bow", 1, 3);}
        if (weaponType.equalsIgnoreCase("GoodBow")) {return new GoodBow("Good Bow", 4, 4);}
        
        return null;
    }
    
}
