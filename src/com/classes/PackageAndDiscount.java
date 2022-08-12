package com.classes;

import java.lang.*;
import com.interfaces.*;

public class PackageAndDiscount extends HotelRoom implements IPackageFunctions
{
    public int TotalPackageCost=0;
    public int TotalPackageDiscountCost=0;
    String[] RoomPackageType = new String[4];

    RoomPackageType [1] ="Honnymoon Package";
    RoomPackageType [2] ="Group Tour Package";
    RoomPackageType [3] ="Business Trip Package";

    int RoomPackageCost[]=new RoomPackageCost[4];

    public int PackageCalculation(int packageIndex){  //will return The Actual total cost of the Pakages

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
    public int PackageDiscountCalculation(int packageIndex){ //will return The discounted price for packages

        switch(packageIndex) {
            case 1:
                TotalPackageDiscountCost = TotalPackageCost * 0.88;
                return TotalPackageDiscountCost;
                break;

            case 2:
                TotalPackageDiscountCost = TotalPackageCost * 0.92;
                return TotalPackageDiscountCost;
                break;

            case 3:
                TotalPackageDiscountCost = TotalPackageCost * 0.90;
                return TotalPackageDiscountCost;
                break;
            default:
                return 0;
        }


}