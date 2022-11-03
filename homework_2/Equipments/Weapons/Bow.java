package Equipments.Weapons;

public abstract class Bow extends Weapon {

    protected int range;

    public Bow(String name, int damage, int range) {
        super(name, damage);
        this.range = range;
    }
    
}