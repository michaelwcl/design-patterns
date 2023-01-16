package strategy;

/**
 * A Knight that is a Character
 * @author Michael Cluver
 */

public class Knight extends Character {

    /**
     * Creates a Knight Character with a given name
     * @param name A user specified name for the Queen
     */
    public Knight(String name) {
        super(name);
        this.WeaponBehavior = new WeaponBow();
        this.setWeaponBehavior(this.WeaponBehavior);
    }

    /**
     * Calls the attack method from the given Characters 
     * @return A String type representation of the Characters attack move
     */
    public String attack() {
        return this.WeaponBehavior.attack();
    }

    /**
     * Create a String type representation of the Character or its children
     * @return Returns a String version of the Character or its children
     */
    public String toString() {
        return this.name + "is a valiant knight";
    }
}
