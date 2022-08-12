package com.classes;

import java.lang.*;


public abstract class  Employee
{
	protected String employeeName;
	protected float employeeSalary;
	protected String employeePhoneNumber;
	protected String employeePost;

	public void setEName(String employeeName)
	{
		this.employeeName=employeeName;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setSalary(float employeeSalary)
	{
		this.employeeSalary=employeeSalary;
	}
	public float getEmployeeSalary()
	{
		return employeeSalary;
	}

	public void setENumber(String employeePhoneNumber)
	{
		this.employeePhoneNumber=employeePhoneNumber;
	}
	public String getENumber()
	{
		return employeePhoneNumber;
	}

	public void setPost(String employeePost)
	{
		this.employeePost=employeePost;
	}
	public String getEmployeePost()
	{
		return employeePost;
	}
}