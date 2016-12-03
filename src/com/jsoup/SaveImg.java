package com.jsoup;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;

import java.net.URL;

public class SaveImg 
{
	public void DownloadImg(String imageUrl,String newUrl)
	{
		 try
		 {
			 String imgUrl =  "http://today.hit.edu.cn" + imageUrl;
			 URL url = new URL(imgUrl); 
			 //打开网络输入流
	         DataInputStream dis = new DataInputStream(url.openStream());
	         String newImageName = newUrl + imageUrl;
	         //建立一个新的文件
	         FileOutputStream fos = new FileOutputStream(new File(newImageName));
	         byte[] buffer = new byte[1024];
	         int length;
	         //开始填充数据
	         while( (length = dis.read(buffer))>0){
	             fos.write(buffer,0,length);
	         }
	         dis.close();
	         fos.close();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
        
	}
}
