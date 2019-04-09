package ie.app.main;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import ie.app.models.Donation;

public class DonationApp extends Application
{
    public final int       target       = 10000;
    public int             totalDonated = 0;
    public List <Donation> donations    = new ArrayList<Donation>();


    public boolean newDonation(Donation donation)
    {
        boolean targetAchieved = totalDonated > target;
        if (!targetAchieved)
        {
            totalDonated += donation.amount;
        }
        else
        {
            Toast.makeText(this, "Target Exceeded!", Toast.LENGTH_SHORT).show();
        }
        return targetAchieved;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.v("Donate", "Donation App Started");
        Log.v("Donate", "Database Created");

    }
}