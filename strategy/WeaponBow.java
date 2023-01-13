package strategy;
import java.util.Random;

public class WeaponBow implements WeaponBehavior
{
    public String attack()
    {
        Random r = new Random();
        int choice = r.nextInt(3);

        switch(choice)
        {
            case 1:
            return "Draw and loose an arrow";
            case 2:
            return "Shoot arrow high in the sky";
            default:
            return "Error";
        }
    }
}
