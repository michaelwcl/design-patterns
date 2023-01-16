package strategy;
import java.util.Random;

/**
 * A WeaponNone that implements WeaponBehavior
 * @author Michael Cluver
 */

public class WeaponNone implements WeaponBehavior {
    /**
     * Creates a randomized String as an attack move
     * @return Returns a String including the random attack move
     */
    public String attack() {
        Random r = new Random();

        int choice = r.nextInt(1, 3);

        switch(choice) {
            case 1:
            return "Oh no! I lost my weapon";
            case 2:
            return "No one lets me have a weapon";
            default:
            return "Error";
        }


    }
}
