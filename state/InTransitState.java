package state;
/**
 * A class to indicate the package is in transit
 * @author Michael Cluver
 */

public class InTransitState extends State{
    private int days = 5;

    public InTransitState(Package pkg, int quantity){
        super(pkg, quantity);
    }

    /**
     * The following methods handles outputs for when the program reports a package in the "in transit state"
     * The only logic is when a delay happens and the amount of days increases
     */
    public String getStatus(){
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " out for delivery.";
    }

    public String getETA(){
        return "The " + pkg.getName() + " should arrive within " + days + " days.";
    }

    public String delay(){
        days = days + 3;
        return "The " + pkg.getName() + " " + getVerb("has", "have") + " experienced a delay in shipping" + "\n" + getETA();
    }
}
