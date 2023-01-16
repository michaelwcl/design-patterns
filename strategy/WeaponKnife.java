package strategy;
import java.util.Random;

/**
 * A WeaponKnife that implements WeaponBehavior
 * @author Michael Cluver
 */

public class WeaponKnife implements WeaponBehavior {
    /**
     * Creates a randomized String as an attack move
     * @return Returns a String including the random attack move
     */
    public String attack() {
        Random r = new Random();
        int choice = r.nextInt(1, 4);

        switch(choice) {
            case 1:
            return "Slice with a knife";
            case 2:
            return "Jab with a knife";
            case 3:
            return "Sneak up on an opponent with a knife";
            default:
            return "Error";
        }  
    }
}
