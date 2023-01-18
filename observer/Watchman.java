package observer;
import java.util.ArrayList;

public class Watchman implements Subject 
{
    private ArrayList<Observer> observers;
    private int warning;

    public Watchman()
    {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

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

    public void notifyObservers()
    {
        for(int i = 0; i < observers.size(); i++)
        {
            observers.get(i).update(this.warning);
        }
    }
}
