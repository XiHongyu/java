package com.polymorphi.test;

/**
 *����̳г����� ��Ҫ��д������󷽷�
 */
public class Dog extends Pet{
	
	public Dog() {
		super();
		
	}
	public Dog(int health){
		super(health);
	}

	@Override
	public void eat() {
			System.out.println("����������");
			this.setHealth(this.getHealth()+3);
	}
	//�������еķ���  �����
	public void frisbee(){
		System.out.println("С���ӷ���");
	}
}
