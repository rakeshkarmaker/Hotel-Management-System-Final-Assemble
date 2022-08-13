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
    public int getpassword() {return password;}
    public StringBuffer getsecurityQuestion() {return securityQuestion;}


    public int passwordVerification(String usrName, String pass){  //0 false 1 true
        try
        {
            if(userName.length() < 8 || password.length(pass) > 16 )
            {
                throw new MyException();
                return 0;
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

}