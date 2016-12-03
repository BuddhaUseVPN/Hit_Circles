package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.dao_Talk;

/**
 * Servlet implementation class getTalksComment
 */
@WebServlet("/getTalksComment")
public class getTalksComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTalksComment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String title = request.getParameter("title");
		dao_Talk t = new dao_Talk();
		int id = t.getID(title);
		request.setAttribute("id", id);
		request.setAttribute("title", title);
		request.setAttribute("text", request.getParameter("text"));
		request.setAttribute("userID",request.getParameter("userID"));
		request.setAttribute("comment", t.getTalksComment(id));
		request.getRequestDispatcher("/showtalk.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
