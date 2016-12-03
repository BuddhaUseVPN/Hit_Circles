package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.Talks;
import com.bean.news;
import com.bean.userbean;
import com.util.DBUtil;

public class dao_My 
{
	public userbean getMyInformation(String userID)
	{
		userbean u = new userbean();
		try
		{
			String sql = "select * from user";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				if(rs.getString("userID").equals(userID))
				{
					u.setuserID(rs.getString("userID"));
					u.setpassword(rs.getString("password"));
					u.settellphone(rs.getString("tellphone"));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return u;
	}
	
	public void FavoriteTalk(int id,String userID)
	{
		try
		{
			String sql = "insert into talk_favorite(id,userID) values(?,?)";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.setString(2, userID);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void FavoriteNews(String userID,String url)
	{
		try
		{
			String sql = "insert into news_favorite(userID,url) values(?,?)";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, userID);
			st.setString(2, url);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<news> getMyNews(String userID)
	{
		ArrayList<news> T = new ArrayList<news>();
		ArrayList<String> s = new ArrayList<String>();
		try
		{
			String sql1 = "select * from news_favorite";
			Connection con1 = DBUtil.getConnection();
			PreparedStatement st1 = con1.prepareStatement(sql1);
			ResultSet rs1 = st1.executeQuery();
			while(rs1.next())
			{
				if(userID.equals(rs1.getString("userID")))
				{
					s.add(rs1.getString("url"));
				}
			}
			
			String sql2 = "select * from news";
			Connection con2 = DBUtil.getConnection();
			PreparedStatement st2 = con2.prepareStatement(sql2);
			ResultSet rs2 = st2.executeQuery();
			while(rs2.next())
			{
				for(int i=0;i<s.size();i++)
				{
					if(s.get(i).equals(rs2.getString("url")))
					{
						news n = new news();
						n.setId(rs2.getInt("id"));
						n.settags(rs2.getString("tags"));
						n.settitle(rs2.getString("title"));
						n.seturl(rs2.getString("url"));
						n.setdate(rs2.getString("date"));
						T.add(n);
					}
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return T;
	}
	
	public ArrayList<Talks> getMyTalk(String userID)
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
				if(userID.equals(rs.getString("userID")))
				{
					Talks t = new Talks();
					t.setId(rs.getInt("id"));
					t.setUserID(rs.getString("userID"));
					t.setTitle(rs.getString("title"));
					t.setText(rs.getString("text"));
					T.add(t);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return T;
	}
	
	public ArrayList<Talks> getFavoriteTalk(String userID)
	{
		ArrayList<Talks> T = new ArrayList<Talks>();
		int id[] = new int[1000];
		for(int j=0;j<1000;j++) id[j]=0;
		int i=0;
		try
		{
			String sql1 = "select * from talk_favorite";
			Connection con1 = DBUtil.getConnection();
			PreparedStatement st1 = con1.prepareStatement(sql1);
			ResultSet rs1 = st1.executeQuery();
			while(rs1.next())
			{
				if(userID.equals(rs1.getString("userID")))
				{
					id[i] = rs1.getInt("id");
					i++;
				}
			}
			
			String sql2 = "select * from talks";
			Connection con2 = DBUtil.getConnection();
			PreparedStatement st2 = con2.prepareStatement(sql2);
			ResultSet rs2 = st2.executeQuery();
			while(rs2.next())
			{
				for(int j=0;id[j]!=0;j++)
					if(id[j]==rs2.getInt("id"))
						{
							Talks t = new Talks();
							t.setId(rs2.getInt("id"));
							t.setUserID(rs2.getString("userID"));
							t.setTitle(rs2.getString("title"));
							t.setText(rs2.getString("text"));
							T.add(t);
						}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return T;
	}
	
	public void AddFriend(String friend1,String friend2)
	{
		try
		{
			String sql = "insert into friend(friend1,friend2) values(?,?)";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, friend1);
			st.setString(2, friend2);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getMyfriend(String userID)
	{
		ArrayList<String> friends = new ArrayList<String>();
		try
		{
			String sql = "select * from friend";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				if(rs.getString("friend1").equals(userID))
				{
					friends.add(rs.getString("friend2"));
				}
				else if(rs.getString("friend2").equals(userID))
				{
					friends.add(rs.getString("friend1"));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return friends;
	}
	
	public ArrayList<String> getNotfriend(String userID)
	{
		ArrayList<String> user = new ArrayList<String>();
		ArrayList<String> friends = getMyfriend(userID);
		try
		{
			String sql1 = "select * from user";
			Connection con = DBUtil.getConnection();
			PreparedStatement st1 = con.prepareStatement(sql1);
			ResultSet rs1 = st1.executeQuery();
			while(rs1.next())
			{
				user.add(rs1.getString("userID"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i=0,len=user.size();i<len;i++)
		{
			for(int j=0;j<friends.size();j++)
			{
				if(friends.get(j).equals(user.get(i)))
				{
					user.remove(i);
					len--;
					i--;
				}
			}			
		}
		for(int i=0;i<user.size();i++)
		{
			if(user.get(i).equals(userID))
			{
				user.remove(i);
				break;
			}
		}
		return user;
	}
}
