package com.classes;

import com.interfaces.*;
import java.lang.*;

public class Admin implements IAdmin{

    protected StringBuffer adminName = new StringBuffer("Rakesh Karmaker");
    protected StringBuffer userName = new StringBuffer("Admin");
    protected String password = "AdminPass"; //string
    protected StringBuffer securityQuestion = new StringBuffer("Cat");

    public void setAdminDetails(String adminName,String userName,String password,String securityQuestion){

        this.adminName.setLength(0);
        this.adminName.append(adminName);

        this.userName.setLength(0);
        this.userName.append(userName);

        this.password = password;

        this.securityQuestion.setLength(0);
        this.securityQuestion.append(securityQuestion);
    }  public StringBuffer getAdminName() {return adminName;}
    public StringBuffer getuserName() {return userName;}
    public String getpassword() {return password;}
    public StringBuffer getsecurityQuestion() {return securityQuestion;}


    public int passwordVerification(String usrName, String pass){  //0 false 1 true
        try
        {
            if(userName.length() < 8 || password.length() > 16 )
            {
                throw new MyException();
            }
            else
            {if(password.equals(usrName) && password.equals(pass)){return 1;
            } else{ return 0;}

            }
        }
        catch(MyException me)
        {
            System.out.println(me.getMessage());
            me.printStackTrace();
        }

        return 0;
    }
    /*boolean changePassword(){
  String pass = ""; //get old password from user
  int n = 3;
  while (n-- > 0) {
    if(pass.equals(Password)) {
        String newPass = ""; // get new password from user
        String conNewPass = ""; // confirm new password from user
        if (newPass.equals(conNewPass)) {
            Password = newPass;
            // password changed
            return true;
        } else {
            // wrong confirmation.. password not changed
            return false;
        }
    }
    else {
        // tell user to enter the correct old password
        pass = ""; // ask user for old password again
    }
  }
  // show error message that user entered the old password 3 times incorrectly
  // and return false
  return false;
  }
     */


}