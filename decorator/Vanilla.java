package decorator;
/**
 * A vanilla flavored ice cream. can be stacked
 * @author Michael Cluver
 */
public class Vanilla extends ScoopDecorator
{
    /**
     * Makes a vanilla ice cream of specific scoops
     * @param iceCream adds an ice cream to stacked, or a bowl/cone
     * @param numScoops the amount of this ice cream in scoops
     */
    public Vanilla(IceCream iceCream, int numScoops)
    {
        super(iceCream, numScoops);
        this.flavor = "vanilla";
        this.flavorCost = 1.25;
    }
}
