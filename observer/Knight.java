package observer;

/**
 * A Knight who is supposed to react according to their profession when a warning is received
 * @author Michael Cluver
 */
public class Knight implements Observer
{
    Subject watchman;

     /**
     * Creates a Knight who is supposed to listen to a specific Watchman for updates
     * @param watchman A Watchman who will update this specific class
     */
    public Knight(Subject watchman)
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
            System.out.println("Knight: Helps everyone get home safe.");
        }
        else if(warning == 2)
        {
            System.out.println("Knight: Prepares for battle");
        }
        else
        {
            System.out.println("invalid warning issued");
        }
    }
}
