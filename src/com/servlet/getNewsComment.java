package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.dao.dao_News;
import com.jsoup.SaveImg;

/**
 * Servlet implementation class getNewsComment
 */
@WebServlet("/getNewsComment")
public class getNewsComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNewsComment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String url= request.getParameter("url");
		int id = Integer.parseInt(request.getParameter("id"));
		Document link = Jsoup.connect(url).get();
		Elements l = link.select("div.articletext").select("img[src]");
		for(int i=0;i<l.size();i++)
		{
			String imgurl = l.get(i).attr("src");
			String dir = "D:/java/Hit_Circles/WebContent/images";
			if (imgurl.trim().startsWith("/")) 
			{
				SaveImg s = new SaveImg();
				s.DownloadImg(imgurl,dir);
				l.get(i).attr("src","images"+imgurl);
			}
		}
		String text = link.select("div.articletext").html();
		dao_News n = new dao_News();
		request.setAttribute("id", id);
		request.setAttribute("title", request.getParameter("title"));
		request.setAttribute("text", text);
		request.setAttribute("comment", n.getNewsComment(id));
		request.getRequestDispatcher("/shownew.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
