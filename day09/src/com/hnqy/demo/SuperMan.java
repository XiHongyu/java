package com.hnqy.demo;
	/**
	*������̳�����
	*/
public class SuperMan extends Person {
	
	public SuperMan() {
		super();

	}

	public SuperMan(String name, int age) {
		super(name, age);

	}

	// ��д���෽��
	public void eat() {
		System.out.println(getName()+"����");
	}
	public static void sleep(){
		System.out.println("����˯");
	}

	// �������еķ���
	public void fly() {
		System.out.println("�ɳ�ȥ����");
	}
}
