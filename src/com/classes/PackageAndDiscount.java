package com.classes;

import java.lang.*;
import com.interfaces.*;

public class PackageAndDiscount extends Service
{
    public int TotalPackageCost=0;
    public int PackageDiscount=0;
    String[] RoomPackageType = new String[4];

    RoomPackageType [1] ="Honnymoon Package || 12% Discount";
    RoomPackageType [2] ="Group Tour Package || 8% Discount";
    RoomPackageType [3] ="Business Trip Package || 10% Discount";

    float RoomPackageCost = 0;


    public int PackageCalculation(int packageIndex){  //Returns Original Price

        switch(packageIndex) {
            case 1:  //Honnymoon
                RoomPackageCost = TotalRoomCost(1,0); //Royal suite +Ac+
                TotalPackageCost = RoomPackageCost+ 5000; //5000 taka for services like car trave;,pickup,buffet etc.

                return TotalPackageCost;

            case 2: //Group Tour
                RoomPackageCost = TotalRoomCost(1,0); //King size +Ac+
                TotalPackageCost = RoomPackageCost + 10000; //5000 taka for services like car trave;,pickup,buffet etc.

                return TotalPackageCost;

            case 3://Business
                RoomPackageCost = TotalRoomCost(1,3); //Royal suite +Ac+
                TotalPackageCost = RoomPackageCost + 7000; //5000 taka for services like car trave;,pickup,buffet etc.
                return TotalPackageCost;

            break;

            default:
                return 0;
        }

    }
    public int PackageDiscountCalculation(int packageIndex){ //will return The discounted price for packages

        switch(packageIndex) {
            case 1:
                PackageDiscount = TotalPackageCost * 0.88;
                return PackageDiscount;
                break;

            case 2:
                PackageDiscount = TotalPackageCost * 0.92;
                return PackageDiscount;
                break;

            case 3:
                PackageDiscount = TotalPackageCost * 0.90;
                return PackageDiscount;
                break;
            default:
                return 0;
        }


}