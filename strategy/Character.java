package strategy;

/**
 * Base class character, abstract with some implemented methods
 * @author Michael Cluver
 */

public abstract class Character {
    protected String name;
    protected WeaponBehavior WeaponBehavior;

    /**
     * Creates a new Character with the indicated name
     * @param name The name of the character
     * 
     */
    public Character (String name) {
        this.name = name;
    }

    /**
     * Calls the attack method from the given characters 
     * @return A String type representation of the players attack move
     */
    public String attack() {
        return this.WeaponBehavior.attack();
    }

    /**
     * A class to allow instantiated Charaters to change their weapon on the fly
     * @param wb A WeaponBehavior type that represents the Characters weapon of choice
     */
    public void setWeaponBehavior(WeaponBehavior wb) {
        this.WeaponBehavior = wb;
    }

    /**
     * An abstract class for other child classes to implement
     * @return A string representation of the Character
     */
    public abstract String toString();
}
