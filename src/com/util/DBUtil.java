package com.util;
import java.sql.*;

public class DBUtil 
{
	private  static Connection connect = null;
	public static Connection getConnection() throws Exception
	{
		 Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
		 connect = DriverManager.getConnection(
		      "jdbc:mysql://localhost:3306/hit_circles","root","123456");
		      //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������
		 return connect;
	}
}
