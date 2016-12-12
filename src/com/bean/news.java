package com.bean;

public class news 
{
	private int id;
	private String tags;
	private String title;
	private String url;
	private String date;
	
	public int getId()
	{
		return id;
	}
	
	public String gettags()
	{
		return tags;
	}
	
	public String gettitle()
	{
		return title;
	}
	
	public String geturl()
	{
		return url;
	}
	
	public String getdate()
	{
		return date;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void settags(String tags)
	{
		this.tags = tags;
	}
	
	public void settitle(String title)
	{
		this.title = title;
	}
	
	public void seturl(String url)
	{
		this.url = url;
	}
	
	public void setdate(String date)
	{
		this.date = date;
	}
}
