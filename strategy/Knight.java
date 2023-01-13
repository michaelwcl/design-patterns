package strategy;

public class Knight extends Character {
    public Knight(String name) {
        super(name);
        this.WeaponBehavior = new WeaponBow();
        this.setWeaponBehavior(this.WeaponBehavior);
    }

    public String attack() {
        return this.WeaponBehavior.attack();
    }

    public String toString() {
        return this.name + "is a valiant knight";
    }
}
