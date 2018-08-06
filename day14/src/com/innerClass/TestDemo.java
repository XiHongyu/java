package com.innerClass;

public class TestDemo {
	
	public static void main(String[] args) {
		//livingInsideClass(); //ʵ��û�ڲ�����ʾ
		//staticInsideClass();//��̬�ڲ�����ʾ
		InnerClassDemo01 ic=new InnerClassDemo01();   //�ֲ��ڲ������
		ic.methodC();
		
		//�����ڲ���  ����̳���һ�����������ʵ��ĳ���ӿ�
		Myinterface face=new Myinterface() {
			//ʵ����ķŷ���  ��д�ӿڵĳ��󷽷�
			@Override
			public void methodA() {
				System.out.println("�����ڲ���");
			}
		};
		face.methodA();
		
		
		
		
	}

	private static void staticInsideClass() {
		//��̬�ڲ���  ʵ��������
		InnerClassDemo01.Inner01 i1=new InnerClassDemo01.Inner01("����", 23);
		i1.methodA();  //����������ʵ������   
		i1.methodB();  //���������þ�̬����  ��̬�����ڲ������ⲿ����� �����ⲿ��ʵ������
		
		//������ֱ�ӵ��þ�̬����
		InnerClassDemo01.Inner01.methodB();
	}

	private static void livingInsideClass() {
		//��ʼ���ⲿ�����
		InnerClassDemo01 icd=new InnerClassDemo01("����",24);
		
		//icd.methoA();   //�ⲿ���������ⲿ�෽��
		//��ʼ��һ���ڲ���Ķ���  �����ⲿ���������ڲ���
		InnerClassDemo01.Inner inner=icd.new Inner("����",23);
		inner.methoA();   	//�ڲ����������ڲ��෽��
		inner.methoB();		//�ڲ��෽�������ⲿ�෽��
		
		//�����ⲿ��ֱ�Ӹ���ʼ���ⲿ��
		InnerClassDemo01.Inner in=new InnerClassDemo01("������",24).new Inner("����", 25);
		in.methoA();   //�ڲ������λ�ڲ��ڷ���
		in.methoB();   //�����ⲿ��Ա����ͨ���ڲ������
	}
}
