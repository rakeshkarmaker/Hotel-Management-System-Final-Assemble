package com.classes;
import java.lang.*;


public class Admin {

    protected StringBuffer adminName = new StringBuffer("Rakesh Karmaker");
    protected StringBuffer userName = new StringBuffer("Admin");
    protected int password = 12345678;
    protected StringBuffer securityQuestion = new StringBuffer("Cat");

    public void setAdminDetails(String adminName,String userName,int password,String securityQuestion){

        this.adminName.setLength(0);
        this.adminName.append(adminName);

        this.userName.setLength(0);
        this.userName.append(userName);

        this.password = password;

        this.securityQuestion.setLength(0);
        this.securityQuestion.append(securityQuestion);

    }
    public StringBuffer getAdminDetailz(){

        adminName
    }
+"  "+userName+"  "+password+"  "+securityQuestion);

}