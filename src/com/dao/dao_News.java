package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.comment;
import com.bean.news;
import com.util.DBUtil;

public class dao_News 
{
	public void InsertNews(String tags,String Title,String url,String date)
	{
		try
		{
			String sql = "insert into news(tags,title,url,date) values(?,?,?,?)";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, tags);
			st.setString(2, Title);
			st.setString(3, url);
			st.setString(4, date);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<news> getNews()
	{
		ArrayList<news> News = new ArrayList<news>();
		try
		{
			String sql = "select * from news";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				news n = new news();
				n.setId(rs.getInt("id"));
				n.settags(rs.getString("tags"));
				n.settitle(rs.getString("title"));
				n.seturl(rs.getString("url"));
				n.setdate(rs.getString("date"));
				News.add(n);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return News;
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
	
	public ArrayList<String> gettags()
	{
		ArrayList<String> tags = new ArrayList<String>();
		try
		{
			String sql = "select * from news";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				tags.add(rs.getString("tags"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return tags;
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
	
	public ArrayList<news> searchNews(String text)
	{
		ArrayList<news> News = new ArrayList<news>();
		try
		{
			String sql = "select * from news";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				if(rs.getString("title").indexOf(text)>-1)
				{
					news n = new news();
					n.setId(rs.getInt("id"));
					n.settags(rs.getString("tags"));
					n.settitle(rs.getString("title"));
					n.seturl(rs.getString("url"));
					n.setdate(rs.getString("date"));
					News.add(n);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return News;
	}
}
