package strategy;

public abstract class Character {
    protected String name;
    protected WeaponBehavior WeaponBehavior;

    public Character (String name) {
        this.name = name;
    }

    public String attack() {
        return this.WeaponBehavior.attack();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        this.WeaponBehavior = wb;
    }

    public abstract String toString();
}
