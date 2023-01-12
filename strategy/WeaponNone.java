package strategy;

public class WeaponNone implements WeaponBehavior
{
    public String attack()
    {
        return "Oh no! I lost my weapon";
    }
}
