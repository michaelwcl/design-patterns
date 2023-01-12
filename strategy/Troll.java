package strategy;

public class Troll extends Character
{
    public Troll(String name)
    {
        super(name);
        this.WeaponBehavior = new WeaponAxe();
        this.setWeaponBehavior(this.WeaponBehavior);
    }

    public String attack()
    {
        return this.WeaponBehavior.attack();
    }

    public String toString()
    {
        return this.name + "is a funny troll";
    }
}
