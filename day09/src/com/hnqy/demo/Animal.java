package com.hnqy.demo;
//������
public class Animal {
	String colour;   //ëɫ
	String name;
	public Animal() {
		super();
		System.out.println("���Ƕ���");	
	}
	public Animal(String colour, String name) {
		super();
		this.colour = colour;
		this.name = name;
		System.out.println("���������ֵĶ���");
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
		System.out.println("��");
	}
	public void sleep(){
		System.out.println("˯");
	}
	
}
