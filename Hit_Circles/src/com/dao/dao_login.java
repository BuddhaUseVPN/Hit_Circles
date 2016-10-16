package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.util.DBUtil;

public class dao_login
{
	public boolean login(String userID,String password) 
	{
		try
		{
			String sql = "select * from user";
			Connection con = DBUtil.getConnection();
			PreparedStatement st1 = con.prepareStatement(sql);
			ResultSet rs1 = st1.executeQuery();
			while(rs1.next())
			{
				if(rs1.getString("userID").equals(userID) && rs1.getString("password").equals(password))
				{
					return true;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
}
