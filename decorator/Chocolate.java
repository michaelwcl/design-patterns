package decorator;
/**
 * A chocalate flavored ice cream. Can be stacked on other ice creams
 * @author Michael Cluver
 */
public class Chocolate extends ScoopDecorator
{
    /**
     * Makes a specific flavored ice cream with adressable quantity
     * @param iceCream Another ice cream that this one will stack on, or a bowl/cone
     * @param numScoops How many scoops of this ice cream will exist
     */
    public Chocolate(IceCream iceCream, int numScoops)
    {
        super(iceCream, numScoops);
        this.flavor = "chocalate";
        this.flavorCost = 1.5;
    }
}
