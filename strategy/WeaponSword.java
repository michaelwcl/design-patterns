package strategy;
import java.util.Random;

/**
 * A WeaponSword that implements WeaponBehavior
 * @author Michael Cluver
 */

public class WeaponSword implements WeaponBehavior {
    /**
     * Creates a randomized String as an attack move
     * @return Returns a String including the random attack move
     */
    public String attack() {
        Random r = new Random();
        int choice = r.nextInt(1, 4);

        switch(choice) {
            case 1:
            return "Lunge and strike with sword";
            case 2:
            return "Fancy turn and slice with sword";
            case 3:
            return "Jam opponents blade with sword";
            default:
            return "Error";
        }
    }
}
