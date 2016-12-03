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
		Date date= new Date();//创建一个时间对象，获取到当前的时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//设置时间显示格式
		String str = sdf.format(date);//将当前时间格式化为需要的类型
		String url = "http://today.hit.edu.cn/articleDay/"+str+".htm";
		Document link = Jsoup.connect(url).get();
		Elements links = link.select("div.news");
		ArrayList<String> hrefs = new ArrayList<String>();
		ArrayList<String> tags = new ArrayList<String>();
		for(int i=0;i<links.size();i++)
		{
			Elements d = links.get(i).getElementsByTag("a");
			Elements e = links.get(i).getElementsByTag("font");
			for(int j=1;j<d.size();j+=2)
				hrefs.add("http://today.hit.edu.cn"+d.get(j).attr("href"));
			for(int z=0;z<e.size();z++)
				tags.add(e.get(z).text());	
		}
		for(int i=0;i<tags.size() && i<hrefs.size();i++)
		{
			Document doc = Jsoup.connect(hrefs.get(i)).get();
			String title = doc.title();
			String date_1[] = doc.getElementById("date").text().split(" ");
			String date_2 = date_1[0] + " " + date_1[1];
			dao_News n = new dao_News();
			n.InsertNews(tags.get(i),title,hrefs.get(i),date_2);
		}	
	}
}
