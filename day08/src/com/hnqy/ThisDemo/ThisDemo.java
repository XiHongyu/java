package com.hnqy.ThisDemo;

import com.hnqy.test.UserBean;
/**
 *this使用
 *	1.局部变量与成员变量名相同时用this区分
 *2.实例方法之间互相调用，理论上可以不用this  一般不要省略
 *3.作为方法的返回值，用于链式编程
 *4.作为方法的参数传递
 *5.构造方法之间互相调用  this[参数] 
 */
class StudentThis{
	private String name;
	private int age;
	public StudentThis() {
		this("");
	}
	public StudentThis(String name){
		//this调用另一个构造方法,必须在构造方法的第一条语句
		this("haha",23);
		this.name=name;
	}
	public StudentThis(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	//this用于区分局部变量与成员变量
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class ThisDemo {

	
	public static void main(String[] args) {
		//dome1();
		//dome2();
	}

	private static void dome2() {
		//通过构造方法给属相赋值
		UserBean ub1=new UserBean("Haha",24);
		System.out.println(ub1.getName()+"..."+ub1.getAge());
	}

	private static void dome1() {
		//通过set方法给属性赋值
		UserBean ub=new UserBean();
		ub.setName("xixi");
		ub.setAge(23);
		ub.setSex(true);
		System.out.println(ub.getName()+"..."+ub.getAge()+"..."+ub.isSex());
	}
}


