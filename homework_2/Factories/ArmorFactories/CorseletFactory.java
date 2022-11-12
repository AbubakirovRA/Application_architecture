package Factories.ArmorFactories;
import Equipments.Armors.Chainmail;

/**
 * PlateFactory
 */
public class CorseletFactory extends ArmorFactory{

    private static CorseletFactory instance;

    private CorseletFactory(){};

    public static CorseletFactory runFactory(){
        return instance == null ? new CorseletFactory() : instance;
    };

    @Override
    public Chainmail createArmor(String armorType) {
        if (armorType.equalsIgnoreCase("Base")) {return new Chainmail("Corselet armor", 3);}
        return new Chainmail("Without armor", 0);
    }

    
}
