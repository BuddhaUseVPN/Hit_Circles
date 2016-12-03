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
 * Servlet implementation class FavoriteNews
 */
@WebServlet("/FavoriteNews")
public class FavoriteNews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FavoriteNews() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String url = request.getParameter("url");
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
	   	dao_My m = new dao_My();
	   	m.FavoriteNews(userID, url);
	   	request.getRequestDispatcher("/getNews.Servlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
