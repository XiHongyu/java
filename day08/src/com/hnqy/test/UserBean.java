package com.hnqy.test;
	/**
	 *����һ��User��  ��ѭJavaBean�Ĺ淶
	 *1.�������public����
	 *2.�ṩ�����Ĺ�����
	 *3.�ֶ���private���β��ṩ�����Ĳ�������
	 *
	 */
public class UserBean {
	//�������Խ���˽��
	private String name;
	private int age;
	private boolean sex;
	//�޲ι���
	public UserBean() {
		super();
		
	}
	//�вι���
	//this����ǰ���� ˭���������Ҿʹ���˭ 
	public UserBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//��ȡ����
	public String getName() {
		return name;
	}
	//��������
	public void setName(String name) {
		this.name = name;
	}
	//��ȡ����
	public int getAge() {
		return age;
	}
	//��������
	public void setAge(int age) {
		this.age = age;
	}
	//boolean���͵������� isXxx()������ȡ��ֵ
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
}
