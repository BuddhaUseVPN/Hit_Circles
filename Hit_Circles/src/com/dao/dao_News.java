package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.comment;
import com.util.DBUtil;

public class dao_News 
{
	public void InsertNews(String Title,String url)
	{
		try
		{
			String sql = "insert into news(title,url) values(?,?)";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, Title);
			st.setString(2, url);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void setNewsComment(int id,String userID,String comment)
	{
		try
		{
			String sql = "insert into newcomment(id,userID,comment) values(?,?,?)";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.setString(2, userID);
			st.setString(3, comment);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<comment> getNewsComment(int id)
	{
		ArrayList<comment> list = new ArrayList<comment>();
		try
		{
			String sql = "select * from newcomment";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				if(rs.getInt("id")==id)
				{
					comment c = new comment();
					c.setId(rs.getInt("id"));
					c.setUserID(rs.getString("userID"));
					c.setComment(rs.getString("comment"));
					list.add(c);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public int[] getID()
	{
		int []id = new int[100000];
		int i = 0;
		try
		{
			String sql = "select * from news";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				id[i] = rs.getInt("id");
				i++;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return id;
	}
	
	public ArrayList<String> getTitle()
	{
		ArrayList<String> title = new ArrayList<String>();
		try
		{
			String sql = "select * from news";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				title.add(rs.getString("title"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return title;
	}
	
	public ArrayList<String> getUrl()
	{
		ArrayList<String> url = new ArrayList<String>();
		try
		{
			String sql = "select * from news";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				url.add(rs.getString("url"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return url;
	}
}
