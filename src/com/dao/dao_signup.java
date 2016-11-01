package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.userbean;
import com.util.DBUtil;

public class dao_signup 
{
	public boolean Judge(String userID)
	{
		try
		{
			String sql = "select userID from user";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				if(rs.getString("userID").equals(userID))
				{
					return false;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean signup(userbean user) 
	{
		if(!Judge(user.getuserID()))
		{
			return false;
		}
		try
		{
			String sql = "insert into user(userID,password,tellphone) values(?,?,?)";
			Connection con = DBUtil.getConnection();
			PreparedStatement st1 = con.prepareStatement(sql);
			st1.setString(1, user.getuserID());
			st1.setString(2, user.getpassword());
			st1.setString(3, user.gettellphone());
			st1.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
}
