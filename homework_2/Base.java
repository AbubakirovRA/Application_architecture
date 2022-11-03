import Characters.Heroes;
import Characters.Knight;
import Characters.Archer;
import Factories.ArmorFactories.ArmorFactory;
import Factories.ArmorFactories.MailFactory;
import Factories.ArmorFactories.PlateFactory;
import Factories.Character_Factories_Abstact.ArcherFactory;
import Factories.Character_Factories_Abstact.KnightFactory;
import Factories.WeaponFactories.BowFactory;
import Factories.WeaponFactories.SwordFactory;
import Factories.WeaponFactories.WeaponFactory;

/**
 * Program
 */
public class Base {
    public static void main(String[] args) {
        WeaponFactory bowFactory = BowFactory.getFactory();
        WeaponFactory swordFactory = SwordFactory.getFactory();
        ArmorFactory mailFactory = MailFactory.getFactory();
        ArmorFactory plateFactory = PlateFactory.getFactory();

        Heroes Archer = new Archer("Archy", 20, bowFactory.createWeapon("EpicBow"), mailFactory.createArmor("Basic"));
        Heroes Knight = new Knight("Knity", 50, swordFactory.createWeapon("SimpleSword"), plateFactory.createArmor("Basic"));

        System.out.println(Archer.getCharInfoString());
        System.out.println("");
        System.out.println(Knight.getCharInfoString());

        System.out.println("-------------------");


        //characters Abstact factory method
        Heroes Archer2 = ArcherFactory.getFactory().CreateCharater("Mikle", "SimpleBow", "Non exiting armor name");
        Heroes Knight2 = KnightFactory.getFactory().CreateCharater("WIlliam", "EpicSword", "Basic");
        
        System.out.println(Archer2.getCharInfoString());
        System.out.println("");
        System.out.println(Knight2.getCharInfoString());
    }
}