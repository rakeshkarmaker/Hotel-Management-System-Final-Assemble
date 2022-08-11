package com.classes;

import java.lang.*;
import com.interfaces.*;

public class PackageAndDiscount extends HotelRoom implements GuestFunctions
{
    public int TotalPackageCost=0;
    public int TotalPackageDiscount=0;
    String RoomPackageType[]=new RoomPackageType[4];

    RoomPackageType [1] ="Honnymoon Package";
    RoomPackageType [2] ="Group Tour Package";
    RoomPackageType [3] ="Business Trip Package";

    int RoomPackageCost[]=new RoomPackageCost[4];

    public int PackageCalculation(int packageIndex){

        switch(packageIndex) {
            case 1:  //Honnymoon
                 int RoomPackageCost [packageIndex] = TotalRoomCostCalculator(1,0); //Royal suite +Ac+
                TotalPackageCost = RoomPackageCost+ 5000; //5000 taka for services like car trave;,pickup,buffet etc.
                TotalPackageCost *= 0.88;

                return TotalPackageCost;

            case 2: //Group Tour
                int RoomPackageCost [packageIndex] = TotalRoomCostCalculator(1,0); //King size +Ac+
                TotalPackageCost = (RoomPackageCost*NumberofGuests) + 10000; //5000 taka for services like car trave;,pickup,buffet etc.
                TotalPackageCost *= 0.92;

                return TotalPackageCost;

                break 3://Business
                int RoomPackageCost [packageIndex] = TotalRoomCostCalculator(1,3); //Royal suite +Ac+
            TotalPackageCost = (RoomPackageCost*NumberofGuests) + 7000; //5000 taka for services like car trave;,pickup,buffet etc.
            TotalPackageCost *= 0.90;

            break;

            default:
                return 0;
        }

    }
    public int PackageDiscountCalculation(int packageIndex){

        switch(packageIndex) {
            case 1:
                TotalPackageDiscount = TotalPackageCost * (1-0.88);
                return TotalPackageDiscount;
                break;

            case 2:
                TotalPackageDiscount = TotalPackageCost * (1-0.92);
                return TotalPackageDiscount;
                break;

            case 3:
                TotalPackageDiscount = TotalPackageCost * (1-0.90);
                return TotalPackageDiscount;
                break;
            default:
                return 0;
        }


}