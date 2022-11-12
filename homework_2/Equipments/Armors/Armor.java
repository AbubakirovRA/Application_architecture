package Equipments.Armors;

import Equipments.Equipment;

public abstract class Armor extends Equipment{
    protected String name;
    protected int level;
    
    protected Armor(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }
}
