package com.box;

public class BoxDeno {

	/**
	 *�������Ͱ�װ��
	 *	���ã��������������ͷ�װ�ɶ��� �����ٶ����ж������ķ�����������ݵĲ���
	 *������������                          ��װ��
	 *  byte            Byte
	 *  short           Short
	 *  int             Integer
	 *  long            Long
	 *  float           Float
	 *  double          Double
	 *  char            Character
	 *  boolean        Boolean
	 *  
	 *  װ�䣺�ѻ�������ת���ɶ���Ӧ�İ�װ������
	 *  	�ֶ�װ�䣺1.ͨ��Integer���췽��
	 *  		   2.ͨ��Integer�ľ�̬����  Integer.valueOf();
	 *  ���䣺�Ѱ�װ������ת���ɻ�����������
	 *  	�ֶ�����: 1.ͨ���������intValue()����
	 *  JDK1.5֮������Զ�װ�����
	 */
	public static void main(String[] args) {
		//int�İ�װ�� Integer
		
		//demo1();//Integer�еĳ���
		
		//demo();//����ת��
		
		//demo2();
		
		//�ք��b��
		     //1.���췽�� 
				Integer i=new Integer(22);
			//2.��̬����
				Integer.valueOf(22);
		//�ֶ�����
			i.intValue();
			
		//JDK1.5����Զ�װ�����
			Integer i1=22;  //�Զ�װ��
			int i3=i;   //�Զ�����
		
			//int ����ת����String����
			int a=1234;
			String str=a+"";   //ֱ������һ���ַ���
			String str1=String.valueOf(a); //string�ľ�̬����
			String str2=Integer.toString(a);  //���þ�̬toString����
			String str3=i.toString();     //���÷Ǿ�̬toString����
			
			//Stringתint����
			String s="12345";
			Integer is=new Integer(s);
			int a1=is.intValue();
			int a2=Integer.parseInt(s);
			
			
		
	}

	private static void demo2() {
		//��ʼ��һ��Integer����
		Integer i=new Integer(10);
		Integer i2=new Integer("10");
		//�Ƚ���Integer�����ֵ  ���ö����ֵС����-1  ���õ�ֵ�� ����1  ��ͬ����0
		int a5=i.compareTo(i2);
		System.out.println(a5);
		String str =Boolean.toString(false);
		System.out.println(str);
		int a4=Integer.bitCount(64); //����ָ�� int ֵ�Ķ����Ʋ����ʾ��ʽ�� 1 λ��������
		System.out.println(a4);
	};

	private static void demo() {
		//����ת��
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(16));
		System.out.println(Integer.toBinaryString(64)); //ת��Ϊ������
		System.out.println(Integer.toHexString(15));   //ʮ������
		System.out.println(Integer.toOctalString(64));  //�˽���
	}

	private static void demo1() {
		int a=Integer.MAX_VALUE;  //����int��    2147483647
		System.out.println(a);
		int a1=Integer.MIN_VALUE;    //��С��int��  -2147483648
		System.out.println(a1);
		int a3=Integer.SIZE;      //int ���͵ı���λ��   32
		System.out.println(a3);
	}
}
