package decorator;
/** 
 * A base class of ice cream
 * @author Michael Cluver
*/
public abstract class IceCream 
{
    protected String description;

    /**
     * Returns a text version of this ice cream
     * @return A String represention of this ice cream
     */
    public String toString()
    {
        return this.description;
    }
    /**
     * To calculate cost
     * @return A double that shows the cost of this ice cream
     */
    public abstract double getCost();
}
