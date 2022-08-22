package com.classes;

import java.lang.*;
import com.interfaces.*;

public abstract class Service extends HotelRoom
{
	protected String[] service=new String[4];
	protected float[] serviceCost= new float[4];
	protected float totalServiceCost=0;
	protected int[] arr = new int[4];
	Service() {
		service[0] = "Room Service";
		service[1] = "Food Service";
		service[2] = "Laundry Service";
		service[3] = "Transportation Service";


		serviceCost[0] = 1000; //Room Service
		serviceCost[1] = 3500; //Buffet Service
		serviceCost[2] = 500; //Laundry Service
		serviceCost[3] = 2000; //Transportation Service
	}


	public void ServiceCostCalc(int i0,int i1,int i2,int i3){ //24 com otherwise
		arr[0]=i0;
		arr[1]=i1;
		arr[2]=i2;
		arr[3]=i3;

		for (int i=0;i<=3;i++) {

			switch (arr[i]){
				case 0:
					break;
				case 1:
					totalServiceCost = totalServiceCost + serviceCost[i];
					break;

				default:
					throw new IllegalStateException("Unexpected value: " + arr[i]);
			}
		}
	}public float getServiceCost(){ return totalServiceCost;}


}