package state;
/**
 * A class to show the package has been ordered
 * @author Michael Cluver
 */

public class OrderedState extends State{
    private int days = 2;

    public OrderedState(Package pkg, int quantity){
        super(pkg, quantity);
    }

    public String getStatus(){
        return "The " + pkg.getName() + " " + getVerb("was", "were")+ " ordered.";
    }

    public String getETA(){
        return "The " + pkg.getName() + " will be shipped within " + days + " days. ";
    }

    public String delay(){
        days = days + 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing.\n" + getETA();
    }
}
