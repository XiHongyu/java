package com.EnumDemo;

public class Demo01_EnumClass {

	public static void main(String[] args) {
		EnumClass.weekOf(EnumClass.SUN);
	}
}
/**
 *�Զ���ö����
 *MON("����һ") TUE("���ڶ�")WED("������")THURS("������")FRI("������")SAT("������")SUN("������")
 */
class EnumClass {
	private EnumClass week;
	private EnumClass(){}  //˽�й��췽��  �������������������������
	//�����������ÿһ����ʾһ�ܶ�Ӧ��һ��
	public static final EnumClass MON=new EnumClass();
	public static final EnumClass TUE=new EnumClass();
	public static final EnumClass WED=new EnumClass();
	public static final EnumClass THURS=new EnumClass();
	public static final EnumClass ERI=new EnumClass();
	public static final EnumClass SAT=new EnumClass();
	public static final EnumClass SUN=new EnumClass();
	//�ж���һ���Ƿ���Ϣ  ������������Ϣ��
	public static void weekOf(EnumClass week){
		if(week==SAT||week==SUN){
			System.out.println("��������Ϣ��");
		}else {
			System.out.println("��ʵ�ϰ�");
		}	
	}	
}
