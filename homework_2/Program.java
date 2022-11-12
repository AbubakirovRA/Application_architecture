import Characters.Heroes;
import Characters.Knight;
import Characters.Archer;
import Factories.ArmorFactories.ArmorFactory;
import Factories.ArmorFactories.ChainMailFactory;
import Factories.ArmorFactories.CorseletFactory;
import Factories.WeaponFactories.BowFactory;
import Factories.WeaponFactories.SwordFactory;
import Factories.WeaponFactories.WeaponFactory;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        WeaponFactory bowFactory = BowFactory.runFactory();
        WeaponFactory swordFactory = SwordFactory.runFactory();
        ArmorFactory chainMailFactory = ChainMailFactory.runFactory();
        ArmorFactory corseletFactory = CorseletFactory.runFactory();

        Heroes Archer = new Archer("Archer", 100, bowFactory.createWeapon("GoodBow"), chainMailFactory.createArmor("Base"));
        Heroes Knight = new Knight("Knigth", 100, swordFactory.createWeapon("BadSword"), corseletFactory.createArmor("Base"));

        System.out.println();
        System.out.println(Archer.getTotalInfo());
        System.out.println();
        System.out.println(Knight.getTotalInfo());

    }
}