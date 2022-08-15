package com.classes;

import java.lang.*;
import com.interfaces.*;

public abstract class PackageAndDiscount extends Service {
    protected float RoomPackageCost = 0;
    protected float TotalPackageCost = 0;
    protected float PackageDiscount = 0;
    String[] RoomPackageType = new String[4];

    PackageAndDiscount() {
        RoomPackageType[1] = "Honnymoon Package || 12% Discount";
        RoomPackageType[2] = "Group Tour Package || 8% Discount";
        RoomPackageType[3] = "Business Trip Package || 10% Discount";
    }


    public float PackageCalculation(int packageIndex) {  //Returns Original Price

        switch (packageIndex) {
            case 1:  //Honnymoon
                RoomPackageCost = TotalRoomCost(1, 0); //Royal suite +Ac+
                TotalPackageCost = (float) (RoomPackageCost + 5000.00); //5000 taka for services like car trave;,pickup,buffet etc.
                return TotalPackageCost;

            case 2: //Group Tour
                RoomPackageCost = TotalRoomCost(1, 0); //King size +Ac+
                TotalPackageCost = (float) (RoomPackageCost + 10000.00); //5000 taka for services like car trave;,pickup,buffet etc.

                return TotalPackageCost;

            case 3://Business
                RoomPackageCost = TotalRoomCost(1, 3); //Royal suite +Ac+
                TotalPackageCost = (float) (RoomPackageCost + 7000.00); //5000 taka for services like car trave;,pickup,buffet etc.
                return TotalPackageCost;

            default:
                return 0;
        }

    }

    public float PackageDiscountCalculation(int packageIndex) { //will return The discounted price for packages

        switch (packageIndex) {
            case 1:
                PackageDiscount = (float) (TotalPackageCost * 0.88);
                return PackageDiscount;

            case 2:
                PackageDiscount = (float) (TotalPackageCost * 0.92);
                return PackageDiscount;

            case 3:
                PackageDiscount = (float) (TotalPackageCost * 0.90);
                return PackageDiscount;

            default:
                return 0;
        }


    }
}