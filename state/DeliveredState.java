package state;
/**
 * A class to show the package is delivered
 * @author Michael Cluver
 */

public class DeliveredState extends State{
    public DeliveredState(Package pkg, int quantity){
        super(pkg, quantity);
    }

    public String getStatus(){
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " here for you.";
    }

    public String getETA(){
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " here.";
    }

    public String delay(){
        return "The " + pkg.getName() + getVerb("has", "have") + " already been delivered.";
    }
}
