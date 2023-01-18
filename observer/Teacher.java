package observer;

public class Teacher implements Observer
{
    Subject watchman;

    public Teacher(Subject watchman)
    {
        this.watchman = watchman;

        this.watchman.registerObserver(this);
    }

    public void update(int warning)
    {
        if(warning == 1)
        {
            System.out.println("Teacher: Helps everyone get home safe.");
        }
        else if(warning == 2)
        {
            System.out.println("Teacher: Prepares for battle");
        }
        else
        {
            System.out.println("invalid warning issued");
        }
    }
}
