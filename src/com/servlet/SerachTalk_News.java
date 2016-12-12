package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.dao_News;
import com.dao.dao_Talk;

/**
 * Servlet implementation class SerachTalk_News
 */
@WebServlet("/SerachTalk_News")
public class SerachTalk_News extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerachTalk_News() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String text = request.getParameter("text");
		dao_News n = new dao_News();
		dao_Talk t = new dao_Talk();
		request.setAttribute("keywords", text);
		request.setAttribute("News",n.searchNews(text) );
		request.setAttribute("Talks",t.searchTalks(text) );
		request.getRequestDispatcher("/Search.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
