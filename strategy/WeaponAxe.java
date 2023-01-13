package strategy;
import java.util.Random;



public class WeaponAxe implements WeaponBehavior {
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
