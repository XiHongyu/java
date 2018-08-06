package com.hnqy.bean;

public class StudentDemo {
	public static void main(String[]args){
		logIn l=new logIn();
		String str=l.login("234567", "123456");
		System.out.println(str);
	}
	
}
