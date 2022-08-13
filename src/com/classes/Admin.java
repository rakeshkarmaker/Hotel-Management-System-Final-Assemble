package com.classes;

import com.interfaces.*;
import java.lang.*;


public class Admin implements IAdmin{

    protected StringBuffer adminName = new StringBuffer("Rakesh Karmaker");
    protected StringBuffer userName = new StringBuffer("Admin");
    protected int password = 12345678; //string
    protected StringBuffer securityQuestion = new StringBuffer("Cat");

    public void setAdminDetails(String adminName,String userName,int password,String securityQuestion){

        this.adminName.setLength(0);
        this.adminName.append(adminName);

        this.userName.setLength(0);
        this.userName.append(userName);

        this.password = password;

        this.securityQuestion.setLength(0);
        this.securityQuestion.append(securityQuestion);
    }  public StringBuffer getAdminName() {return adminName;}
    public StringBuffer getuserName() {return userName;}
    public int getpassword() {return password;}
    public StringBuffer getsecurityQuestion() {return securityQuestion;}





}