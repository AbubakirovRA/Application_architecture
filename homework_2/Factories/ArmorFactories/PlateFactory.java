package Factories.ArmorFactories;
import Equipments.Armors.Platemail;

/**
 * PlateFactory
 */
public class PlateFactory extends ArmorFactory{

    private static PlateFactory instance;

    private PlateFactory(){};

    public static PlateFactory getFactory(){
        return instance == null ? new PlateFactory() : instance;
    };

    @Override
    public Platemail createArmor(String armorType) {
        if (armorType.equalsIgnoreCase("Basic")) {return new Platemail("Plate armor", 3);}
        return new Platemail("Naked", 0);
    }

    
}
