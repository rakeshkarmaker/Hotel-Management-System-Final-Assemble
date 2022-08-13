package com.interfaces;

public interface ICheckOutCalculator {
    CheckOutCalculator(int index);
    void setVAT();
    float getVAT();
    int returnChangeCalculator(float CashPaid);

    



}
