package ie.app.models;

/**
 * Created by ddrohan on 22/10/2015.
 */
public class Donation
{
    public int    id;
    public int    amount;
    public String method;

    public Donation (int amount, String method)
    {
        this.amount = amount;
        this.method = method;
    }

    public Donation ()
    {
        this.amount = 0;
        this.method = "";
    }

    public String toString()
    {
        return id + ", " + amount + ", " + method;
    }
}