package com.servlet;

import java.awt.TextArea;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.*;

/**
 * Servlet implementation class InsertTalk
 */
@WebServlet("/InsertTalk")
public class InsertTalk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTalk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String Title = request.getParameter("Title");
		TextArea Text = (TextArea)request.getAttribute("Text");
		String userID = null;
		Cookie cookie[] = request.getCookies();
		if(cookie!=null)
			for(Cookie c:cookie)
			{
				if(c.getName().equals("userID"))
				{
					userID = c.getValue();
				}	
			}
		dao_Talk i = new dao_Talk();
		i.InsertTalk(userID, Title, Text);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
