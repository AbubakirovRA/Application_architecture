package Equipments.Armors;

import Equipments.Equipment;

public abstract class ArmorAbstract extends Equipment{
    protected String name;
    protected int level;
    
    protected ArmorAbstract(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }
}
