package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.dao_My;

/**
 * Servlet implementation class FavoriteTalk
 */
@WebServlet("/FavoriteTalk")
public class FavoriteTalk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FavoriteTalk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("1");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
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
	   	dao_My t = new dao_My();
	   	t.FavoriteTalk(id, userID);
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
