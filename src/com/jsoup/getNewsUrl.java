package com.jsoup;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.dao.dao_News;

public class getNewsUrl 
{
	public void Url() throws IOException
	{
		Date date= new Date();//����һ��ʱ����󣬻�ȡ����ǰ��ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//����ʱ����ʾ��ʽ
		String str = sdf.format(date);//����ǰʱ���ʽ��Ϊ��Ҫ������
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
				String filepath = "C:/Users/������/Desktop"+src1;
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
}
