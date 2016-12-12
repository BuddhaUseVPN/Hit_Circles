package com.util;
import java.sql.*;

public class DBUtil 
{
	private  static Connection connect = null;
	public static Connection getConnection() throws Exception
	{
		 Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
		 connect = DriverManager.getConnection(
		      "jdbc:mysql://localhost:3306/hit_circles","root","123456");
		      //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
		 return connect;
	}
}
