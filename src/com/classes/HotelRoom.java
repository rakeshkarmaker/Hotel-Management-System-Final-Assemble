package com.classes;

import java.lang.*;
import com.interfaces.*;

public class HotelRoom implements GuestFunctions
{
	protected Guest guest[]=new Guest[100];

	protected int hotelRoomAirConditionPrice[] = new hotelRoomAirConditionPrice[2];
	protected int totalRoomCost =0;

	String hotelRoomType[]=new hotelRoomType[4];
	protected int hotelRoomTypePrice[] = new hotelRoomTypePrice[4];
	String hotelRoomAirConditionType[] = new hotelRoomAirConditionType[2];

	hotelRoomType [0] ="Royal Suite";
	hotelRoomType [1] ="King size Bed";
	hotelRoomType [2] ="Twin Bed";
	hotelRoomType [3] ="Standard";


    hotelRoomTypePrice[0]=20000;//Royal suite price
    hotelRoomTypePrice[1]=15000;//King size bed price
    hotelRoomTypePrice[2]=10000;//Twin bed
    hotelRoomTypePrice[3]=7000;//Standard

	hotelRoomAirConditionType[0]="Non-AC"; //Price zero Taka
	hotelRoomAirConditionType[1]="AC";     // Price 1000 Taka


	hotelRoomAirConditionPrice[0]= 0 ;
	hotelRoomAirConditionPrice[1]= 1000;



	public int TotalRoomCostCalculator(int ac , int hotelRoomType){  //Calculates the total cost

		if(hotelRoomType = 0){
			System.out.println(hotelRoomType[hotelRoomType]);
			return hotelRoomTypePrice[hotelRoomType];
		}
		else if(hotelRoomType = 1){
			System.out.println(hotelRoomType[hotelRoomType]);
			return hotelRoomTypePrice[hotelRoomType];
		}
		else if(hotelRoomType = 2){
			System.out.println(hotelRoomType[hotelRoomType]);

			if(ac = 0){
				System.out.println(hotelRoomAirConditionType[ac]);
			}
			else if (ac = 1){
				System.out.println(hotelRoomAirConditionType[ac]);
			}
			return hotelRoomTypePrice[hotelRoomType]+hotelRoomAirConditionPrice[ac];
		}
		else if(hotelRoomType = 3){
			System.out.println(hotelRoomType[hotelRoomAirConditionType]);
			if(ac = 0){
				System.out.println(hotelRoomAirConditionType[ac]);
			}
			else if (ac = 1){
				System.out.println(hotelRoomAirConditionType[ac]);
			}
			return hotelRoomTypePrice[hotelRoomType]+hotelRoomAirConditionPrice[ac];
		}
		else{
			System.out.println("Error Room Type");
		}

	}

	public void addGuest(Guest g)
	{
		int flag=0;

		for(int i=0;i<guest.length;i++)
		{
			if(guest[i]==null)
			{
				guest[i]=g;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Guest Added");
		}
		else 
		{
			System.out.println("Could not add guest");
		}
	}

	public void removeGuest(Guest g)
	{
		int flag=0;

		for(int i=0;i<guest.length;i++)
		{
			if(guest[i]==g)
			{
				guest[i]=null;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Guest Removed");
		}
		else 
		{
			System.out.println("Could not remove guest");
		}
	}

	public void showAllGuests()
	{
		for(Guest g: guest)
		{
			if(g!=null)
			{	
				System.out.println("**********************************");
     			System.out.println("Guest Name: "+ g.getGuestName());
				System.out.println("Guest Phone Number: "+ g.getGuestPhoneNumber());
				System.out.println("Guest Gender: "+ g.getGuestGender());
				System.out.println("Guest Age Type: "+ g.getGuestAgeType());
				System.out.println("Guest Address: "+ g.getGuestAddress());
				System.out.println("----------------------------------");

			}
		}
	}

	public Guest getGuest(String guestName,int guestPhoneNumber)
	{
	  Guest g = null;

	  for(int i=0;i<guest.length;i++)
	  {
	  	if(guest[i]!=null)
	  	{
	  		if(guest[i].getGuestName().equals(guestName) && guest[i].getGuestPhoneNumber().equals(guestPhoneNumber))
	  		{
	  			g=guest[i];
	  			break;
	  		}
	  	}
	  }

	  if(g!=null)
	  {
	  	System.out.println(g);
	  }
	  else 
	  {
	  	System.out.println("Guest not found!");
	  }

	}


	//public abstract void hotelRoomCost();



}