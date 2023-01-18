package observer;

public class ShopOwner implements Observer
{
    Subject watchman;

    public ShopOwner(Subject watchman)
    {
        this.watchman = watchman;

        this.watchman.registerObserver(this);
    }

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
