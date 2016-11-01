package com.jsoup;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;

@SuppressWarnings("deprecation")
public class getBytes 
{
	public byte[] getByte(String url)
	{
		@SuppressWarnings("resource")
		HttpClient client = new DefaultHttpClient();  
        client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 5000);  
        HttpGet get = new HttpGet(url);  
        get.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 5000);  
        try {  
            HttpResponse resonse = client.execute(get);  
            if (resonse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {  
                HttpEntity entity = resonse.getEntity();  
                if (entity != null) {  
                    return EntityUtils.toByteArray(entity);  
                }  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            client.getConnectionManager().shutdown();  
        }  
        return new byte[0];
	}
}
