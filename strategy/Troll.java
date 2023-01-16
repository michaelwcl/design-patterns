package strategy;

/**
 * A Troll that is a Character
 * @author Michael Cluver
 */

public class Troll extends Character {

    /**
     * Creates a Troll Character with a given name
     * @param name A user specified name for the Troll
     */
    public Troll(String name) {
        super(name);
        this.WeaponBehavior = new WeaponAxe();
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
     * @return Returns a String version of the Character or its children (aka a mean comment about trolls)
     */
    public String toString() {
        return this.name + "is a funny troll";
    }
}
