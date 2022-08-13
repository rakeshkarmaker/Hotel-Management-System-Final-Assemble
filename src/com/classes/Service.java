package com.classes;

import java.lang.*;
import com.interfaces.*;

public class Service 
{
	protected float totalServiceCost=0;
	protected String[] service=new String[4];
	
	service[0]="Room Service";
	service[1]="Buffet Service";
	service[2]="Laundry Service";
	service[3]="Transportation Service";

	protected int[] service=new int[4];

	service[0]=1000; //Room Service
	service[1]=3500; //Buffet Service
	service[2]=500; //Laundry Service
	service[3]=2000; //Transportation Service


	public void ServiceCostCalc(int i0,int i1,int i2,int i3){ //24 com otherwise
		int[] arr = new arr[]{i0,i1,i2,i3};

		for (int i=0;i<=3;i++) {

			switch (arr[i]){
				case 0:
					continue;
				case 1:
					totalServiceCost = Float.parseFloat(totalServiceCost+service[i]);
					continue;

				default:
					throw new IllegalStateException("Unexpected value: " + arr[i]);
			}
		}
	}public float geetServiceCost(){ return totalServiceCost;}


}