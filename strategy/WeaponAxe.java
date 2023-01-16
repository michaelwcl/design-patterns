package strategy;
import java.util.Random;

/**
 * A WeaponAxe that implements WeaponBehavior
 * @author Michael Cluver
 */

public class WeaponAxe implements WeaponBehavior {
    /**
     * Creates a randomized String as an attack move
     * @return Returns a String including the random attack move
     */
    public String attack() {
        Random r = new Random();

        int choice = r.nextInt(1, 3);

        switch (choice) {
            case 1:
            return "Twirl with an axe.";
            case 2:
            return "Swing an axe";
            default:
            return "Error";
        }

    }
}
