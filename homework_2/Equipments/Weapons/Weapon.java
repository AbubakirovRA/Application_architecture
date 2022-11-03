package Equipments.Weapons;

public abstract class Weapon {
    protected String name;
    protected int damage;

    public String getName() {
        return name;
    }

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

}
