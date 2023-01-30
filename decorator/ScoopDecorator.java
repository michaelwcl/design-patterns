package decorator;
/**
 * A scoop decoator that adds flavor to ice creams and allows for 
 * stacked ice creams and recursive toString calls
 * @author Michael Cluver
 */
public abstract class ScoopDecorator extends IceCream
{
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;

    /**
     * Creates a ice cream with flavor and scoop count
     * @param iceCream An ice cream that can be stacked on this one, or a bowl/cone as a base
     * @param numScoops The amount of this ice cream
     */
    public ScoopDecorator(IceCream iceCream, int numScoops)
    {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }

    /**
     * A toString method that is called recursively to account for every ice cream
     * @return A string representation of all stacked ice creams
     */
    public String toString()
    {
        if(numScoops == 1)
        {
            return this.iceCream.toString() + ", a scoop of " + this.flavor + " ice cream";
        }
        else
        {
            return this.iceCream.toString() + ", " + this.numScoops + " scoops of " + this.flavor + " ice cream";
        }
    }

    /**
     * A recursively called method to calculate cost
     * @return Returns the cost of the entire ice cream order
     */
    public double getCost()
    {
        return this.iceCream.getCost() + this.flavorCost * numScoops;
    }

}
