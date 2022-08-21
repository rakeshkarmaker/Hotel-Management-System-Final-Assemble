package com.interfaces;

public interface IAdmin {

     void setAdminDetails(String adminName,String userName,String password,String securityQuestion);

     StringBuffer getAdminName();
     StringBuffer getuserName();
     StringBuffer getpassword();
     StringBuffer getsecurityQuestion();
     int passwordVerification(String usrName, String pass);
}
