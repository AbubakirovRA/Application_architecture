package Factories.WeaponFactories;

import Equipments.Weapons.Bow;
import Equipments.Weapons.EpicBow;
import Equipments.Weapons.SimpleBow;

public class BowFactory extends WeaponFactory{

    private static BowFactory instance;

    private BowFactory(){};

    public static BowFactory getFactory(){
        return instance == null ? new BowFactory() : instance;
    };

    @Override
    public Bow createWeapon(String weaponType) {
        if (weaponType.equalsIgnoreCase("SimpleBow")) {return new SimpleBow("Wooden Bow", 1, 3);}
        if (weaponType.equalsIgnoreCase("EpicBow")) {return new EpicBow("Elven Bow", 4, 4);}
        
        //ToDo если не получилось создать ни одного лука, вернуть exception неправильный weaponType (либо сделать weaponType Enum)
        return null;
    }
    
}
