package strategy;
import java.util.Random;

/**
 * A WeaponBow that implements WeaponBehavior
 * @author Michael Cluver
 */

public class WeaponBow implements WeaponBehavior {
    /**
     * Creates a randomized String as an attack move
     * @return Returns a String including the random attack move
     */
    public String attack() {
        Random r = new Random();
        int choice = r.nextInt(1, 3);

        switch(choice) {
            case 1:
            return "Draw and loose an arrow";
            case 2:
            return "Shoot arrow high in the sky";
            default:
            return "Error";
        }
    }
}
