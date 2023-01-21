package observer;
/**
 * Base interface for class dedicated to pushing updates
 * @author Michael Cluver
 */
public interface Subject 
{
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
