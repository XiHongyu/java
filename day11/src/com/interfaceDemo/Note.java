package com.interfaceDemo;

public class Note {
	/**
	 * �����˽��������
	 *  �����  ����򷽷���  ��{}�����������ݶ��д����
	 *		�ֲ�����飺������   ��������ʱִ�� û����һ�� ��ִ��һ��
	 *		��ʼ������飺���ڷ����⣬û���κ�����  ��������ʱ�ڹ��췽��ǰִ�� ÿ����һ�ζ���ִ��һ��
	 *		�������飺���췽�� ��ʼ������ʱִ��һ��
	 *		��̬����飺 static ����  �������jvm��ִ��һ�� ���ڳ���ִ��ʱ����������
	 *
	 *
	 */
	public static void main(String[] args) {
		Note n=new Note();
		Note m=new Note();
		n.print();
		
		Test t=new Test(20);
		System.out.println(t.getV());
	}
	//�ֲ������   ������   ��������ʱִ�� û����һ�� ��ִ��һ��
	public void print(){
		System.out.println("�ֲ������");
	}
	//��ʼ�������  ���ڷ����⣬û���κ�����  ��������ʱ�ڹ��췽��ǰִ�� ÿ����һ�ζ���ִ��һ��
	{
		System.out.println("��ʼ�������");
	}
	//��̬�����  static ����  �������jvm��ִ��һ��
	static{
		System.out.println("��̬�����");
	}
	//��������   ���췽�� ��ʼ������ʱִ��һ��
	public Note(){
		System.out.println("��������");
	}
	
	
	
}

class Test{
	private final int v;
	

	public Test(int v) {
		super();
		this.v = v;
	}

	public int getV() {
		return v;
	}
}
