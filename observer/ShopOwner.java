package observer;

/**
 * A ShopOwner who is supposed to react according to their profession when a warning is received
 * @author Michael Cluver
 */
public class ShopOwner implements Observer
{
    Subject watchman;

    /**
     * Creates a ShopOwner who is supposed to listen to a specific Watchman for updates
     * @param watchman A Watchman who will update this specific class
     */
    public ShopOwner(Subject watchman)
    {
        this.watchman = watchman;

        this.watchman.registerObserver(this);
    }

    /**
     * A class to receive warning and react accordingly
     * @param warning An integer representing the severity of the warning
     */
    public void update(int warning)
    {
        if(warning == 1)
        {
            System.out.println("Shop Owner: Helps everyone get home safe.");
        }
        else if(warning == 2)
        {
            System.out.println("Shop Owner: Prepares for battle");
        }
        else
        {
            System.out.println("invalid warning issued");
        }
    }
}
