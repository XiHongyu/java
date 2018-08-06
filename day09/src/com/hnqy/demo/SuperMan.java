package com.hnqy.demo;
	/**
	*超人类继承人类
	*/
public class SuperMan extends Person {
	
	public SuperMan() {
		super();

	}

	public SuperMan(String name, int age) {
		super(name, age);

	}

	// 重写父类方法
	public void eat() {
		System.out.println(getName()+"吃铁");
	}
	public static void sleep(){
		System.out.println("空中睡");
	}

	// 超人特有的方法
	public void fly() {
		System.out.println("飞出去救人");
	}
}
