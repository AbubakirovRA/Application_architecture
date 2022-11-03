package Factories.Character_Factories_Abstact;

import Characters.Heroes;

/**
 * CharacterFactory
 */
public interface CharacterFactory <T extends Heroes> {
    public T CreateCharater(String name, String weaponName, String armorName);
}
