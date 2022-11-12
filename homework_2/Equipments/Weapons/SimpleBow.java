package Equipments.Weapons;

public abstract class SimpleBow extends WeaponAbstract {

    protected int range;

    public SimpleBow(String name, int damage, int range) {
        super(name, damage);
        this.range = range;
    }
    
}