package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.dao_login;

/**
 * Servlet implementation class login_servlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException,IOException
	{
    	String userID = req.getParameter("userID");
		String password = req.getParameter("password");
		dao_login d = new dao_login();
		if(d.login(userID, password))
		{
			Cookie IDcookie = new Cookie("userID",userID);
			Cookie passcookie = new Cookie("password",password);
			IDcookie.setMaxAge(2000);
			passcookie.setMaxAge(2000);
			res.addCookie(IDcookie);
			res.addCookie(passcookie);
			res.sendRedirect("index.jsp");
		}
		else
			res.sendRedirect("login.jsp");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException,IOException
	{
		doGet(req,res);
	}
	
}
