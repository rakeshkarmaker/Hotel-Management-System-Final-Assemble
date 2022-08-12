package com.classes;

import java.lang.*;
import com.interfaces.*;

public class Service 
{
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

	//?????
	protected String roomService;
	protected String foodService;
	protected String laundryService;
	protected String transportationService;

}