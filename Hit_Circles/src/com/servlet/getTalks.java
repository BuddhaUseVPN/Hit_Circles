package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.dao_Talk;

/**
 * Servlet implementation class getTalks
 */
@WebServlet("/getTalks")
public class getTalks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTalks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		dao_Talk n = new dao_Talk();
		int []id = new int[n.getTitle().size()];
		ArrayList<String> userID = new ArrayList<String>();
		ArrayList<String> title = new ArrayList<String>();
		ArrayList<String> text = new ArrayList<String>();
		for(int i=0;i<n.getUserID().size();i++)
		{
			id[i] = n.getID()[i];
			userID.add(n.getUserID().get(i));
			title.add(n.getTitle().get(i));
			text.add(n.getText().get(i));
		}
		request.setAttribute("id", id);
		request.setAttribute("userID", userID);
		request.setAttribute("title", title);
		request.setAttribute("text", text);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
