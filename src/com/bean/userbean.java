package com.bean;

public class userbean 
{
	private String userID;
	private String password;
	private String tellphone;
	
	public void setuserID(String userID)
	{
		this.userID = userID;
	}
	
	public String getuserID()
	{
		return userID;
	}
	
	public void setpassword(String password)
	{
		this.password = password;
	}
	
	public String getpassword()
	{
		return password;
	}
	
	public void settellphone(String tellphone)
	{
		this.tellphone = tellphone;
	}
	
	public String gettellphone()
	{
		return tellphone;
	}
}
