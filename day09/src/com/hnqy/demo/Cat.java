package com.hnqy.demo;

public class Cat extends Animal {

	public Cat() {
		super();
		System.out.println("����һֻè");
		
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
		System.out.println("����ֻ�����ֵ�è���ҽ�"+name);
	}
	public void eat(){
		System.out.println("è����");
	}
}
