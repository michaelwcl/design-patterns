package decorator;
/**
 * A Bowl to contain multiple scoops of ice cream
 * @author Michael Cluver
 */

public class Bowl extends IceCream
{
    public Bowl()
    {
        this.description = "Bowl";
        
    }

    /**
     * A method to print the cost of the cone. Used recursively
     * @return Returns a numerical value to show cost
     */
    public double getCost()
    {
        return 0;
    }
}
