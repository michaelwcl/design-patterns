package observer;

/**
 * Base interface Observer, to be implemented by classes who will "observe" other classes.
 * @author Michael Cluver
 */

 /*
  * Update is used for sending "updates" to other classes. Must be implemented
  */
public interface Observer 
{
    public void update(int warning);
}
