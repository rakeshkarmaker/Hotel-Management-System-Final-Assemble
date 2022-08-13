package com.interfaces;

public interface IAdmin {


     void setAdminDetails(String adminName,String userName,int password,String securityQuestion);
     StringBuffer getAdminName();
     StringBuffer getuserName();
     int getpassword();
     StringBuffer getsecurityQuestion();
     int passwordVerification(String usrName, String pass);
}
