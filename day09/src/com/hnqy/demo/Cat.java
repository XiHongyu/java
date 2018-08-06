package com.hnqy.demo;

public class Cat extends Animal {

	public Cat() {
		super();
		System.out.println("我是一只猫");
		
	}
	

	@Override
	public String getColour() {
		
		return super.getColour();
	}


	@Override
	public void setColour(String colour) {
		
		super.setColour(colour);
	}


	@Override
	public String getName() {
		
		return super.getName();
	}


	@Override
	public void setName(String name) {
		
		super.setName(name);
	}


	@Override
	public void sleep() {
		
		super.sleep();
	}


	public Cat(String colour, String name) {
		super(colour, name);
		System.out.println(this);
		System.out.println("我是只有名字的猫，我叫"+name);
	}
	public void eat(){
		System.out.println("猫吃鱼");
	}
}
