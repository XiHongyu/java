package com.hnqy.demo;
	/**
	*person类
	*父类 存放公共的属性和行为
	*/
public class Person {
	//公共的属性
	private String name;//姓名
	private int age; //年龄
	public Person() {
		super();
		System.out.println("父类空参构造");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("父类有参构造");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat(){
		System.out.println(name+"吃饭");
	}
	public static void sleep(){
		System.out.println("睡觉");
	}

}
