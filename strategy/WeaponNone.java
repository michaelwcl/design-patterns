package strategy;
import java.util.Random;

public class WeaponNone implements WeaponBehavior {
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
