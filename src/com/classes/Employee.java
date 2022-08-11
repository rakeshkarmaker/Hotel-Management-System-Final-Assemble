package com.classes;

import java.lang.*;
import interfaces.*;

public class Employee
{
	protected String employeeName;
	protected int employeeSalary;
	protected String employeeNumber;
	protected String employeePost;

	public void setEName(String employeeName)
	{
		this.employeeName=employeeName;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setSalary(int employeeSalary)
	{
		this.employeeSalary=employeeSalary;
	}
	public int getEmployeeSalary()
	{
		return employeeSalary;
	}

	public void setENumber(String employeeNumber)
	{
		this.employeeNumber=employeeNumber;
	}
	public String getENumber()
	{
		return employeeNumber;
	}

	public void setPost(String employeePost)
	{
		this.employeePost=employeePost;
	}
	public String getEmployeePost()
	{
		return employeePost;
	}

	public abstract void showEmployeeDetails();
}