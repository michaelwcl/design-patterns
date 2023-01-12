package strategy;

public class King extends Character
{
    public King(String name)
    {
        super(name);
        super.WeaponBehavior = new WeaponSword();
        this.setWeaponBehavior(super.WeaponBehavior);
    }

    public String attack()
    {
        return this.WeaponBehavior.attack();
    }

    public String toString()
    {
        return this.name + "is a noble king.";
    }
}
