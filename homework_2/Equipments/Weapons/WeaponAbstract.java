package Equipments.Weapons;

import Equipments.Equipment;

public abstract class WeaponAbstract extends Equipment{
    protected String name;
    protected int damage;

    public String getName() {
        return name;
    }

    protected WeaponAbstract(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

}
