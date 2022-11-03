package Factories.ArmorFactories;

import Equipments.Armors.Chainmail;

/**
 * MailFactory
 */
public class MailFactory extends ArmorFactory{

    private static MailFactory instance;

    private MailFactory(){};

    public static MailFactory getFactory(){
        return instance == null ? new MailFactory() : instance;
    };

    @Override
    public Chainmail createArmor(String armorType) {
        if (armorType.equalsIgnoreCase("Basic")) {return new Chainmail("Mail armor", 1);}
        return new Chainmail("Naked", 0);
    }

    
}