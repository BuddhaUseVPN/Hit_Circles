package com.bean;

public class Talks 
{
	private int id;
	private String userID;
	private String title;
	private String text;
	
	public int getId()
	{
		return id;
	}
	
	public String getUserID()
	{
		return userID;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getText()
	{
		return text;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setUserID(String userID)
	{
		this.userID = userID;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
}
