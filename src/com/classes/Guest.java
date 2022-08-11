package com.classes;

import java.lang.*;
import com.interfaces.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Guest implements GuestFunctions
{
	protected String guestName;
	protected int guestPhoneNumber;
	protected String guestGender;
	protected String guestAddress;
	protected String guestAgeType;
	protected int NumberofGuests;

	public void SetCheckInTime(int daysOfStay) { //Will set the default check in time which is now and add the days of stay and set the checkout date and time.
		LocalDate checkInDate = LocalDate.now(); //OUTPUT: 2022-02-02
		LocalTime checkInTime = LocalTime.now(); //Local Time: 7:30

		LocalDate checkOutDate = checkInDate.plusDays(daysOfStay);
		LocalTime checkOutTime = LocalTime.of(12,00);

		String checkOutDateString = checkOutDate.format(DateTimeFormatter.ISO_DATE); //Converting to string

	}
	public  String getCheckInTime() { //returns expected checkoutdate

		return checkOutDateString;
	}
	
	public void setGuestName(String guestName)
	{
		this.guestName=guestName;
	}
	public String getGuestName()
	{
		return guestName;
	}

	public void setGuestPhoneNumber(int guestPhoneNumber)
	{
		this.guestPhoneNumber=guestPhoneNumber;
	}
	public int getGuestPhoneNumber()
	{
		return guestPhoneNumber;
	}

	public void setGuestGender(String guestGender)
	{
		this.guestGender=guestGender;
	}
	public String getGuestGender()
	{
		return guestGender;
	}

	public void setGuestAdress(String guestAddress)
	{
		this.guestAddress=guestAddress;
	}
	public String getGuestAddress()
	{
		return guestAddress;
	}
	public void setGuestAgeType(String guestAgeType)
	{
		this.guestAgeType=guestAgeType;
	}
	public String guestAgeType()
	{
		return guestAgeType;
	}

	public abstract void showGuestDetails(String guestName,int guestPhoneNumber);
	public abstract void showAllGuests();
	
}