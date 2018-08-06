package com.hnqy.bean;
public class Student {
	/**
	*
	*/
//不同包下默认修饰符修饰
	String name;
	void part(){
		System.out.println(name);
	}
	//不同包下public修饰
	public int age;
	public void print(){
		System.out.println(age);
	}
}
 