package com.hnqy.demo;

/**
 *����̳и���
 *	���Լ̳и��๫�������Ժͷ�����˽�еĲ��ܱ��̳�
 *	�ؼ���extends
 *	javaֻֻ֧�ֵ��̳У�ֻ��һ�����ף�
 *	����������Լ�������
 *
 *	���������븸����ͬ�����Ժ���Ϊʱ��super����
 * super������� ֻ�ܴ���������ĳ�Ա���������췽���� ���ڹ��췽���б����ǵ�һ�����
 * ������๹�췽����ûдsuper�����ô��Ĭ�Ϸ��ʸ�����޲ι���
 * ��������ʱ���Ƚ���super���ִ�и��๹��
 * superͬ���޷����ʸ���˽�еĳ�Ա
 * 
 * ������������Ժͷ����Ͳ�����ʹ�ø����  ��ʱ���������ʹ�ø���ľ���super���ʸ����еĳ�Ա
 *  */
public class Student extends Person {
	String ID;
	String name;

	public Student() {
		super();
		System.out.println("����ղι���");
		
	}

	public Student(String name, int age) {
		super(name, age);
		System.out.println("�����вι���");
		
	}
	public void showFu(){
		System.out.println(super.getName()+"..."+super.getAge());
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
