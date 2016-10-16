package com.dao;

import java.awt.TextArea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.comment;
import com.util.DBUtil;

public class dao_Talk 
{
	public void InsertTalk(String userID,String Title,TextArea Text)
	{
		try
		{
			String sql = "insert into talks(userID,title,text) values(?,?,?)";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,userID);
			st.setString(2,Title);
			st.setString(3, Text.toString());
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void setTalksComment(int id,String userID,String comment)
	{
		try
		{
			String sql = "insert into talkcomment(id,userID,comment) values(?,?,?)";
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
	
	public ArrayList<comment> getTalksComment(int id)
	{
		ArrayList<comment> list = new ArrayList<comment>();
		try
		{
			String sql = "select * from talkcomment";
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
			String sql = "select * from talks";
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
	
	public ArrayList<String> getUserID()
	{
		ArrayList<String> userID = new ArrayList<String>();
		try
		{
			String sql = "select * from talks";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				userID.add(rs.getString("userID"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return userID;
	}
	
	public ArrayList<String> getTitle()
	{
		ArrayList<String> title = new ArrayList<String>();
		try
		{
			String sql = "select * from talks";
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
	
	public ArrayList<String> getText()
	{
		ArrayList<String> text = new ArrayList<String>();
		try
		{
			String sql = "select * from talks";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				text.add(rs.getString("text"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return text;
	}
}
