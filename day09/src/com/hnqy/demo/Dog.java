package com.hnqy.demo;

public class Dog extends Animal{

	public Dog() {
		super();
		System.out.println("����һֻ��");
		
	}

	public Dog(String colour, String name) {
		super(colour, name);
		System.out.println("���Ǹ������ֵĹ����ҽ�"+name);	
	}
	public void eat(){
		System.out.println("������");
	}
	
	
}
