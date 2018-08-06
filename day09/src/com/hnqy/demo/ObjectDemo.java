package com.hnqy.demo;
	/**
	*Object ��  ������ĸ���
	*���÷���
	*	toString()���ص�ǰ������й���Ϣ  ���ַ������ͷ���
	*   equals()�Ƚ����������Ƿ���ͬһ������  �Ƿ���true
	*   hashCode()���ض���Ĺ�ϣ��ֵ
	*   getClass() ��ȡ��ǰ��������������Ϣ
	*/
public class ObjectDemo {
	public static void main(String[] args) {
		//������д�����ж�����ѧ�������Ƿ���ͬһ����
		demo1();
		
		//demo2();   //����toString();����
		 
		demo3();    //����hashCode();����
	}

	private static void demo3() {
		StudentDemo stu=new StudentDemo();
		int a=stu.hashCode();
		System.out.println(a);
		
	}

	private static void demo2() {
		//toString����  ���ص�ǰ���������������Ϣ
		StudentDemo stu=new StudentDemo("����",34567,34);
		String str=stu.toString();
		System.out.println(str);
	}

	private static void demo1() {
		//����ѧ������������д��equals����
		StudentDemo stu1=new StudentDemo("������",23456,23);
		StudentDemo stu=stu1;
		//ͬһ������
		System.out.println(stu.equals(stu1));
		//��ͬ����   ������ͬ  ѧ����ͬ
		StudentDemo stu2=new StudentDemo("������",23456,23);
		System.out.println(stu1.equals(stu2));
		//��ͬ������ͬ���� ��ѧ�Ų�ͬ
		StudentDemo stu3=new StudentDemo("������",65433,24);
		System.out.println(stu3.equals(stu1));
	}
	
}

//����һ����  ��дequals����
//���ѧ�ź���������ͬ˵����ͬһ����
class StudentDemo{
	private String name;
	private int id;
	private int age;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public StudentDemo(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}


	public StudentDemo() {
		super();
		
	}

//��дequals����
	@Override
	public boolean equals(Object o) {
		if(super.equals(o))
			return true;
		StudentDemo stu=(StudentDemo)o;
		if(this.id==stu.id && this.name.equals(stu.name)){
			return true;
		}
		return false;
	}


	//��дtoString����  ���ص�ǰ�����˵������
	@Override
	public String toString() {
		
		return name+"  "+id+"  "+age;
	}


	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	
}
	
	
	

