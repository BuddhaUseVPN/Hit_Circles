package com.jsoup;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.dao.dao_News;



/**
 * Servlet implementation class getnews
 */
@WebServlet("/getnews")
public class getNewsUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNewsUrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			Date date= new Date();//创建一个时间对象，获取到当前的时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//设置时间显示格式
			String str = sdf.format(date);//将当前时间格式化为需要的类型
			String url = "http://today.hit.edu.cn/articleDay/"+str+".htm";
			Document link = Jsoup.connect(url).get();
			Elements links = link.select("div.news");
			ArrayList<String> hrefs = new ArrayList<String>();
			for(int i=0;i<links.size();i++)
			{
				Elements d = links.get(i).getElementsByTag("a");
				for(int j=1;j<d.size();j+=2)
					hrefs.add("http://today.hit.edu.cn"+d.get(j).attr("href"));
			}
			for(int i=0;i<hrefs.size();i++)
			{
				Document doc = Jsoup.connect(hrefs.get(i)).get();
				String title = doc.title();
				dao_News n = new dao_News();
				n.InsertNews(title,hrefs.get(i));
				Elements body = doc.select("div.articletext").select("p,img");
				for(int j=0;j<body.size();j++)
				{
					String text = body.get(j).text();
				}
				/*Elements img = doc.select("div.articletext").select("img");
				for(int j=0;j<img.size();j++)
				{
					String src = img.attr("abs:src");
					String src1 = src.substring(src.lastIndexOf("/"));
					String filepath = "C:/Users/高文林/Desktop"+src1;
					getBytes b = new getBytes();
					byte[] bit = b.getByte(src);
					BufferedOutputStream o = null;   
				    if (bit.length > 0) 
				    {  
				           try {  
				                o = new BufferedOutputStream(new FileOutputStream(filepath));  
				                o.write(bit);  
				                o.flush();  
				            } finally
				           {  
				                if (o != null)  
				                    o.close();  
				           }  
				    }  
				}*/
			}	
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
