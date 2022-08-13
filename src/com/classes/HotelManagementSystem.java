package com.classes;

import static javax.swing.JOptionPane.showMessageDialog;

public class HotelManagementSystem {
    Guest[] guest = new Guest[1000];


    public void guestCheckIn(String guestName,int guestPhoneNumber,String guestGender,String guestAddress,String guestAgeType,CheckOutCalculator totalcost)
    {
        int flag = 0;
        guest = new guest(a);
        for(int i=0; i<guest.length; i++)
        {
            if(guest[i] == null)
            {
                guest[i] = guest;
                guest[i].setGuestName(guestName); //searrch == ... index free /null
                guest[i].setGuestName(guestName);
                guest[i].setGuestName(guestName);
                guest[i].setGuestName(guestName);
                flag = 1;
                break;
            }
        }
        if(flag == 1){showMessageDialog(null, "Interstion Successful!");}
        else {showMessageDialog(null, "Unsuccesful operation!");}
    }
    /*
    	protected String guestName;
	protected int guestPhoneNumber;
	protected String guestGender;
	protected String guestAddress;
	protected String guestAgeType;
     */



///ADD REMOVE DELETE MODIFY
    //FILE HANDLING ... CVS.....2d array.........read write and modify.
//booking -----guest add
    //guest add rmv === guest add. arr ob obj.

    /*
    1. Room booking. //add
    2.Check in guest (Add) //search if found then checked in else ()
    3.Check out guest (remove)
     */

}
