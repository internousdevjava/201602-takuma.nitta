package com.internousdev.jissenkadai4.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jissenkadai4.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class LoginAction extends ActionSupport implements SessionAware{
	private String username;
	private String password;
	private Map<String,Object> session;
//実行メソッド
	public String execute(){

//	System.out.println("fdsafasfdasfsafsa");
	LoginDAO dao = new LoginDAO();
	boolean ret = dao.select(username,password);
	if(ret == true){
	session.put("name_key", dao.getAdmin_name());
	return SUCCESS;
	}else{
	return ERROR;
	}
}




public void setSession(Map<String,Object> session){
	this.session = session;
}
  public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public Map<String, Object> getSession() {
	return session;
}

//ゲッターとセッター
public String getUserName(){
	return username;
}
public void setUserName(String username){
	this.username = username;
}

public String getPassword(){
	return password;
}

public void setPassword(String password){
	this.password = password;
}
//	boolean a = dao.select;
//	}if(a == true){
//		session.put(SUCCESS);
//	}else{
//		session.put(ERROR);
//	}
}