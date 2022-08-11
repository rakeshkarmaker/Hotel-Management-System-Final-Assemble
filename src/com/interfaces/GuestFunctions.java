package com.interfaces;

public interface GuestFunctions {
     void SetCheckInTime(int daysOfStay);
      String getCheckInTime();

     void setGuestName(String guestName);
     String getGuestName();

     void setGuestPhoneNumber(int guestPhoneNumber);
     int getGuestPhoneNumber();

     void setGuestGender(String guestGender);
     String getGuestGender();
     void setGuestAdress(String guestAddress);
     String getGuestAddress();
     void setGuestAgeType(String guestAgeType);
     String guestAgeType();

    //public abstract void showGuestDetails(String guestName,int guestPhoneNumber);
    //public abstract void showAllGuests();
}
