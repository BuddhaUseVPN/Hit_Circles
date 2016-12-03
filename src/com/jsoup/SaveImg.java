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
			 //������������
	         DataInputStream dis = new DataInputStream(url.openStream());
	         String newImageName = newUrl + imageUrl;
	         //����һ���µ��ļ�
	         FileOutputStream fos = new FileOutputStream(new File(newImageName));
	         byte[] buffer = new byte[1024];
	         int length;
	         //��ʼ�������
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
