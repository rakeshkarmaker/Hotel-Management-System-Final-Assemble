package com.classes;
import java.lang.*;

public class HotelManagementSystem
{
    Guest[] guest = new Guest[1000];

    public void guestCheckIn(Guest g)
    {
        int flag = 0;
        //guest = new guest();
        for(int i=0; i<guest.length; i++)
        {
            if(guest[i] == null)
            {
                guest[i] = g;
                flag = 1;
                break;
            }
        }
        if(flag == 1){System.out.println("Interstion Successful!");}
        else {System.out.println("Unsuccesful operation!");}
    }

    public void guestCheckOut(Guest g)
    {
        int flag = 0;
        for(int i=0; i<guest.length; i++)
        {
            if(guest[i].getGuestName().equals(g))
            {
                guest[i] = null;
                flag = 1;
                break;
            }
        }
        if(flag == 1){System.out.println("Deletion Successful!");}
        else{System.out.println("Unsuccesful operation!");}
    }

    public Guest getGuest(String guestName)
    {
        Guest g = null;

        for(int i=0; i<guest.length; i++)
        {
            if(guest[i] != null)
            {
                if(guest[i].getGuestName() == guestName)
                {
                    g = guest[i];
                    break;
                }
            }
        }
        if(g != null)
        {
            System.out.println("Guest Found");
        }
        else
        {
            System.out.println("Guest Not Found");
        }
        return g;
    }

}