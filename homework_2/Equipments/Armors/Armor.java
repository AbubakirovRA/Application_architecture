package Equipments.Armors;

public abstract class Armor {
    protected String name;
    protected int defence;

    public Armor(String name, int defence) {
        this.name = name;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }
}
