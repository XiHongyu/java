package com.interfaceDemo;

public class FinalDemo {

	/**
	 *final���յ����η�
	 *		final������ ��ʾ�����಻�ܱ��̳�   �������γ�����
	 *		final���εķ�����ʾ���շ��� ���ܱ���д    ͬ���������γ��󷽷�
	 *		final���ε��ֶγ�����ֵ���ܱ��ı䣬����������������ʱ�ǵ�ֵַ���ܸı䣬�������ݻ����Ըı�
	 *		��public static final ���ε�  �����������ô�д  ����������»�������
	 */
	public static void main(String[] args) {
		Demo01 d=new Demo02();
		d.print();
		Demo02.print();
	}
	
}

class Demo01{
	public  static void print(){
		System.out.println("hahha");
	}
}
class Demo02 extends Demo01{
	public  static void print(){
		System.out.println("xixix");
	}
}