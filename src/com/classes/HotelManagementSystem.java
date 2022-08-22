package com.classes;
import java.lang.*;

import com.interfaces.*;

public class HotelManagementSystem implements ICheckInCheckOutOperations
{
    Guest[] guest = new Guest[1000];
    Employee[] employee = new Employee[1000];

    public void guestCheckIn(Guest g) {
        int flag = 0;
        //guest = new guest();
        for(int i=0; i<guest.length; i++) {
            if(guest[i] == null) {
                guest[i] = g;
                flag = 1;
                break;
            }
        }
        if(flag == 1){System.out.println("Interstion Successful!");
        } else {System.out.println("Unsuccesful operation!");
        }
    }

    public void guestCheckOut(Guest g) {
        int flag = 0;
        for(int i=0; i<guest.length; i++) {
            if(guest[i].getGuestName().equals(g)) {
                guest[i] = null;
                flag = 1;
                break;
            }
        }
        if(flag == 1){System.out.println("Deletion Successful!");}
        else{System.out.println("Unsuccesful operation!");}
    }

    public Guest getGuest(String guestName) {
        Guest g = null;

        for(int i=0; i<guest.length; i++)
        {
            if(guest[i] != null) {
                if(guest[i].getGuestName() == guestName) {
                    g = guest[i];
                    break;
                }
            }
        }
        if(g != null) {
            System.out.println("Guest Found");
        } else {System.out.println("Guest Not Found");}
        return g;
    }
/****************************************************
 import java.io.*;

 public class Main {

 public static void main(String[] args) {

 //CSV = Comma-Separated Values
 //   text file that uses a comma to separate values

 String file = "src\\students.csv";
 BufferedReader reader = null;
 String line = "";

 try {
 reader = new BufferedReader(new FileReader(file));
 while((line = reader.readLine()) != null) {

 String[] row = line.split(",");
 //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
 //use this if your values already contain commas
 for(String index : row) {
 System.out.printf("%-10s", index);
 }
 System.out.println();
 }
 }
 catch(Exception e) {
 e.printStackTrace();
 }
 finally {
 try {
 reader.close();
 } catch (IOException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 }
 }
 }
 //****************************************************
*/
}