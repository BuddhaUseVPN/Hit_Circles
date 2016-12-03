package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.Talks;
import com.bean.comment;
import com.util.DBUtil;

public class dao_Talk 
{
	public void InsertTalk(String userID,String Title,String Text)
	{
		try
		{
			String sql = "insert into talks(userID,title,text) values(?,?,?)";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,userID);
			st.setString(2,Title);
			st.setString(3, Text);
			
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<Talks> getTalks()
	{
		ArrayList<Talks> T = new ArrayList<Talks>();
		try
		{
			String sql = "select * from talks";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				Talks t = new Talks();
				t.setId(rs.getInt("id"));
				t.setUserID(rs.getString("userID"));
				t.setTitle(rs.getString("title"));
				t.setText(rs.getString("text"));
				T.add(t);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return T;
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
	
	public int getID(String title)
	{
		int id = 0;
		try
		{
			String sql = "select * from talks";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				if(rs.getString("title").equals(title))
				{
					id = rs.getInt("id");
					break;
				}
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
	
	public ArrayList<Talks> searchTalks(String text)
	{
		ArrayList<Talks> talks = new ArrayList<Talks>();
		try
		{
			String sql = "select * from talks";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				if(rs.getString("title").indexOf(text)>-1)
				{
					Talks t = new Talks();
					t.setId(rs.getInt("id"));
					t.setUserID(rs.getString("userID"));
					t.setTitle(rs.getString("title"));
					t.setText(rs.getString("text"));
					talks.add(t);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return talks;
	}
}
