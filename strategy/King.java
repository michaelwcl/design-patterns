package strategy;

/**
 * A King that is a Character
 * @author Michael Cluver
 */

public class King extends Character {

    /**
     * Creates a King Character with a given name
     * @param name A user specified name for the King
     */
    public King(String name) {
        super(name);
        super.WeaponBehavior = new WeaponSword();
        this.setWeaponBehavior(super.WeaponBehavior);
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
        return this.name + "is a noble king.";
    }
}
