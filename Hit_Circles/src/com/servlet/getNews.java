package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.dao_News;

/**
 * Servlet implementation class getNews
 */
@WebServlet("/getNews")
public class getNews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNews() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		dao_News n = new dao_News();
		int []id = new int[n.getTitle().size()];
		ArrayList<String> title = new ArrayList<String>();
		ArrayList<String> url = new ArrayList<String>();
		for(int i=0;i<n.getTitle().size();i++)
		{
			id[i] = n.getID()[i];
			title.add(n.getTitle().get(i));
			url.add(n.getUrl().get(i));
		}
		request.setAttribute("id", id);
		request.setAttribute("title", title);
		request.setAttribute("url", url);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
