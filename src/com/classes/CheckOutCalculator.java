package com.classes;

import java.lang.*;
import com.interfaces.*;

public class CheckOutCalculator {
	protected int totalcostVAT;
	protected int cashPaid;
	protected int returnChange;


	String[] paymentType= new String[4];

	paymentType[0] = "Cash";
	paymentType[1] = "Mobile Banking";
	paymentType[2] = "Visa Card";
	paymentType[3] = "Debit Card";






	public int VATCalculator(int totalCost) {

		totalcostVAT = totalCost * 0.15;
		return totalcostVAT;
	}

	public int returnChangeCalculator(int CashPaid, int totalCost) {

		if (CashPaid >= totalCost) {
			returnChange = CashPaid - totalCost;
			return returnChange;
		} else {
			System.out.println("Error. Sorry your paid amount is not sufficient to complete this transction.");
		}

	}

}