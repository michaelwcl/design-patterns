package state;
/**
 * A class to show the package is delivered
 * @author Michael Cluver
 */

public class DeliveredState extends State{
    public DeliveredState(Package pkg, int quantity){
        super(pkg, quantity);
    }

    /**
     * The following methods handle when the package is delivered. 
     * The only different part compared to other states is that delaying doesn't add any days to the delivery time(since it's already delivered)
     */
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
