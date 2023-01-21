package observer;
import java.util.ArrayList;

/**
 * A Watchman dedicated to pushing updates to other classes
 * @author Michael Cluver
 */

public class Watchman implements Subject 
{
    private ArrayList<Observer> observers;
    private int warning;

    /**
     * Creates a Watchman with its own list of observers that the Watchman needs to update
     */
    public Watchman()
    {
        observers = new ArrayList<Observer>();
    }

    /**
     * Adds an observer to the arraylist
     */
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }
    /**
     * Removes a specific observer from the arraylist
     */
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    /**
     * Determines which warning is to be issued and saves the warning 
     */
    public void issueWarning(int warning)
    {
        this.warning = warning;

        if(this.warning == 1)
        {
            System.out.println("WARNING:  1 trumpet was played!");
        }
        else if(this.warning == 2)
        {
            System.out.println("WARNING:  2 trumpets were played!");
        }

        notifyObservers();
    }

    /**
     * Notifies all the observers in the arraylist
     */
    public void notifyObservers()
    {
        for(int i = 0; i < observers.size(); i++)
        {
            observers.get(i).update(this.warning);
        }
    }
}
