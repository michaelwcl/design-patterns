package decorator;
/**
 * A strawberry flavored ice cream that can be stacked
 * @author Michael Cluver
 */
public class Strawberry extends ScoopDecorator
{
    /**
     * Makes a ice cream of specified flavor and scoops
     * @param iceCream an ice cream that is to be stacked on this one, or a bowl/cone
     * @param numScoops the amount of this ice cream
     */
    public Strawberry(IceCream iceCream, int numScoops)
    {
        super(iceCream, numScoops);
        this.flavor = "strawberry";
        this.flavorCost = 1.4;
    }


}
