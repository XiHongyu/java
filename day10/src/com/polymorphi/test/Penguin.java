package com.polymorphi.test;

/**
 *����һ�������̳г����ಢ��д��Է���
 */
public class Penguin extends Pet{
	
	public Penguin() {
		super();
		
	}

	public Penguin(int health) {
		super(health);
		
	}

	@Override
	public void eat() {
			System.out.println("����������");
			this.setHealth(this.getHealth()+5);
	}
	//������еķ��� Ǳˮ
	public void dive(){
		System.out.println("��ˮ����");
	}
	
	
}
