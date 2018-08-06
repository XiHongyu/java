package com.hnqy.demo;

public class Dog extends Animal{

	public Dog() {
		super();
		System.out.println("我是一只狗");
		
	}

	public Dog(String colour, String name) {
		super(colour, name);
		System.out.println("我是个有名字的狗，我叫"+name);	
	}
	public void eat(){
		System.out.println("狗吃肉");
	}
	
	
}
