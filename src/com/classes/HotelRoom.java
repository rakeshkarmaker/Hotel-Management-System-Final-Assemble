package com.classes;

import java.lang.*;
import com.interfaces.*;

public class HotelRoom extends Guest {
	protected float totalRoomCost;
	protected float[] hotelRoomAirConditionPrice = new float[2];

	String[] hotelRoomType=new String[4];
	protected float[] hotelRoomTypePrice = new float[4];
	String[] hotelRoomAirConditionType = new String[2];
	HotelRoom(){
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
	totalRoomCost = 0;
	}

	public float TotalRoomCost(int ac , int hotelRoomIndex){
		//Calculates the total cost

		if(hotelRoomIndex == 0){//Royal suite price
			totalRoomCost = hotelRoomTypePrice[hotelRoomIndex];
			return totalRoomCost;

		} else if(hotelRoomIndex == 1){//King size bed price
			totalRoomCost = hotelRoomTypePrice[hotelRoomIndex];
			return totalRoomCost;

		} else if(hotelRoomIndex == 2){
			if(ac == 0){
				totalRoomCost = hotelRoomTypePrice[hotelRoomIndex]+hotelRoomAirConditionPrice[ac];

			} else if (ac == 1){
				totalRoomCost = hotelRoomTypePrice[hotelRoomIndex]+hotelRoomAirConditionPrice[ac];
			}
			return totalRoomCost;

		} else if(hotelRoomIndex == 3){

			if(ac == 0){
				totalRoomCost = hotelRoomTypePrice[hotelRoomIndex]+hotelRoomAirConditionPrice[ac];

			} else if (ac == 1){
				totalRoomCost = hotelRoomTypePrice[hotelRoomIndex]+hotelRoomAirConditionPrice[ac];

			}
			return totalRoomCost;

		} else{
			System.out.println("Error Room Type");
			return 0;

		}

	}
}

