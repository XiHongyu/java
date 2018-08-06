package com.hnqy.bean;

	/**
	 *用户登录功能，判断账户密码格式
	 */
public class logIn {
	//判断密码账户格式
	private boolean judge(String s){
		String regex="[1-9]\\d{5}";  //正则表达式设置账号格式
		if(s.matches(regex)){
			return true;
		}
		return false;
	}
	
	//登录入口  接收账户密码
	public String login(String ID,String pwd){
		if(!judge(ID)){
			return "账号格式错误";
		}
		if(ID.equals("234567")&&pwd.equals("123456")){
			return "登陆成功";
		}
		
	return "账号或密码错误";
	}
	
}
