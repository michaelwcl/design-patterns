package strategy;

public class Queen extends Character {
    public Queen(String name) {
        super(name);
        this.WeaponBehavior = new WeaponKnife();
        this.setWeaponBehavior(this.WeaponBehavior);
    }

    public String attack() {
        return this.WeaponBehavior.attack();
    }

    public String toString() {
        return this.name + "is a beautiful queen";
    }
}
