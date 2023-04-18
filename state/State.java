package state;
/**
 * A base abstract class to figure out the state of a package
 * @author Michael Cluver
 */

public abstract class State {
    protected Package pkg;
    protected int quantity;

    public State(Package pkg, int quantity){
        this.pkg = pkg;
        this.quantity = quantity;
    }
    
    public abstract String getStatus();
    public abstract String getETA();
    public abstract String delay();

    /**
     * A method to choose a verb depending on the amount of items a package has
     * @param singular A singular version of a verb
     * @param plural A plural version of a verb
     * @return Either singular or plural
     */
    protected String getVerb(String singular, String plural){
        if(quantity == 1)
            return singular;
        else
            return plural;
    }
}
