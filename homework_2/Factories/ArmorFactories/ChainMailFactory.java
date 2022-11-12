package Factories.ArmorFactories;

import Equipments.Armors.Chainmail;

/**
 * MailFactory
 */
public class ChainMailFactory extends ArmorFactory{

    private static ChainMailFactory instance;

    private ChainMailFactory(){};

    public static ChainMailFactory runFactory(){
        return instance == null ? new ChainMailFactory() : instance;
    };

    @Override
    public Chainmail createArmor(String armorType) {
        if (armorType.equalsIgnoreCase("Base")) {return new Chainmail("ChainMail", 1);}
        return new Chainmail("Without armor", 0);
    }

    
}