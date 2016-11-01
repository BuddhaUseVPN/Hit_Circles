package com.action;

import com.bean.userbean;
import com.dao.dao_signup;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class signup_action extends ActionSupport
{
	private String userID;
	private String password;
	private String tellphone;
	
	public void setUserID(String userID)
	{
		this.userID = userID;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	
	public void setTellphone(String tellphone)
	{
		this.tellphone = tellphone;
	}
	
	public String signup()
	{
		userbean user = new userbean();
		user.setuserID(userID);
		user.setpassword(password);
		user.settellphone(tellphone);
		dao_signup d = new dao_signup();
		if(d.signup(user))
			return "success";
		else
			return "fail";
	}
}
