package com.hnqy.demo;
	/**
	*person��
	*���� ��Ź��������Ժ���Ϊ
	*/
public class Person {
	//����������
	private String name;//����
	private int age; //����
	public Person() {
		super();
		System.out.println("����ղι���");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("�����вι���");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat(){
		System.out.println(name+"�Է�");
	}
	public static void sleep(){
		System.out.println("˯��");
	}

}
