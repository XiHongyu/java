package com.hnqy.test;

import com.hnqy.bean.Student;

public class Test {
	/**
	*测试类  测试访问权限修饰符
	*		 private私有的   
	*		   默认修饰符   
	*		protected受保护的
	*		public公共的
	*
	*/
	private String name;
	private void print(){
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		//private修饰在同一个类内可以访问
		t.name="haha";
		t.print();
		
		//private修饰在不同类内无法访问
		StudentDemo sd=new StudentDemo();
		//sd.name="";
		//sd.print();
		
		//默认修饰符修饰在同一包下可以访问
		StudentDemo01 sd1=new StudentDemo01();
		sd1.name="xixi";
		sd1.print();
		
		//默认修饰符在不同包下无法访问
		Student stu=new Student();
		//stu.name="";
		
		//public 修饰不同包下访问
		stu.age=23;
		stu.print();
		
	}
	
}

 class StudentDemo{
	private String name;
	private void print(){
		System.out.println(name);
	}

}
