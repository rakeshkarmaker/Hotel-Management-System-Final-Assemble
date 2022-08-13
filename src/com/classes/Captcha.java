package com.classes;

import com.interfaces.*;

import java.util.*;
public class Captcha {

    protected int firstNumber;
    protected int secondNumber;
    protected int addition;


    Captcha() {
        Random random = new Random(0);
        firstNumber = random.nextInt(100);
        secondNumber = random.nextInt(100);
        addition = firstNumber + secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public boolean captchaVerify(int answer) {
        if (answer == addition) {
            return 1;

        } else {
            return 0;
        }

    }
}
