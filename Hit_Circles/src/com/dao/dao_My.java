package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
}
