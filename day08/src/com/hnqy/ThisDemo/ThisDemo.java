package com.hnqy.ThisDemo;

import com.hnqy.test.UserBean;
/**
 *thisʹ��
 *	1.�ֲ��������Ա��������ͬʱ��this����
 *2.ʵ������֮�以����ã������Ͽ��Բ���this  һ�㲻Ҫʡ��
 *3.��Ϊ�����ķ���ֵ��������ʽ���
 *4.��Ϊ�����Ĳ�������
 *5.���췽��֮�以�����  this[����] 
 */
class StudentThis{
	private String name;
	private int age;
	public StudentThis() {
		this("");
	}
	public StudentThis(String name){
		//this������һ�����췽��,�����ڹ��췽���ĵ�һ�����
		this("haha",23);
		this.name=name;
	}
	public StudentThis(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	//this�������־ֲ��������Ա����
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class ThisDemo {

	
	public static void main(String[] args) {
		//dome1();
		//dome2();
	}

	private static void dome2() {
		//ͨ�����췽�������ำֵ
		UserBean ub1=new UserBean("Haha",24);
		System.out.println(ub1.getName()+"..."+ub1.getAge());
	}

	private static void dome1() {
		//ͨ��set���������Ը�ֵ
		UserBean ub=new UserBean();
		ub.setName("xixi");
		ub.setAge(23);
		ub.setSex(true);
		System.out.println(ub.getName()+"..."+ub.getAge()+"..."+ub.isSex());
	}
}


