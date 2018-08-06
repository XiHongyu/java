package com.hnqy.demo;
//动物类
public class Animal {
	String colour;   //毛色
	String name;
	public Animal() {
		super();
		System.out.println("我是动物");	
	}
	public Animal(String colour, String name) {
		super();
		this.colour = colour;
		this.name = name;
		System.out.println("我是有名字的动物");
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void eat(){
		System.out.println("吃");
	}
	public void sleep(){
		System.out.println("睡");
	}
	
}
