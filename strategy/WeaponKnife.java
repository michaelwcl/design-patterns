package strategy;
import java.util.Random;

public class WeaponKnife implements WeaponBehavior
{
    public String attack()
    {
        Random r = new Random();
        int choice = r.nextInt(4);

        switch(choice)
        {
            case 1:
            return "Slice with a knife";
            case 2:
            return "Jab with a knife";
            case 3:
            return "Sneak up on an opponent with a knife";
            default:
            return "Sneak up on an opponent with a knife";
        }
        
    }
}
