package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.dao_Talk;


/**
 * Servlet implementation class setTalksComment
 */
@WebServlet("/setTalksComment")
public class setTalksComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public setTalksComment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		Cookie cookie[] = request.getCookies();
		String userID = null;
	   	if(cookie!=null)
	   	{
	   		for(Cookie c:cookie)
			{
				if(c.getName().equals("userID"))
					userID = c.getValue();
			}
	   	}
		String comment =  request.getParameter("comment");
		dao_Talk t = new dao_Talk();
		t.setTalksComment(id, userID, comment);
		request.getRequestDispatcher("/getTalks.Servlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
