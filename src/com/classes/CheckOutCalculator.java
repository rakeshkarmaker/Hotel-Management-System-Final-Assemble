package com.classes;

import java.lang.*;
import java.lang.String;
import com.interfaces.*;

public class CheckOutCalculator extends Service,HotelRoom,Service ,PackageAndDiscount {
	protected float totalCost =0;
	protected float VAT;
	protected float cashPaid;
	protected float returnChange;

	String[] paymentType= new String[4];

	paymentType[0] = "Cash";
	paymentType[1] = "Mobile Banking";
	paymentType[2] = "Visa Card";
	paymentType[3] = "Debit Card";

	CheckOutCalculator(boolean index){ //index 0 means hotel room and service || index 1 means Package

		switch (index){
			case 0:
			totalCost = 0;
			totalCost = totalRoomCost +totalServiceCost;
			break;

			case 1:
				totalCost = 0;
				totalCost =

		}
	}

	public void setVAT() {

		VAT = totalCost * 0.15;

	} public float getVAT(){ return VAT; }

	public int returnChangeCalculator(float CashPaid) {

		if (CashPaid >= totalCost) {
			returnChange = CashPaid - totalCost;
			return returnChange;

		} else {
			System.out.println("Error. Sorry your paid amount is not sufficient to complete this transction.");
			return 0;
		}
	}

}