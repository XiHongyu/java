package com.EnumDemo;

public class Enum_Test {
	/**
	*ö���ೣ�÷�����ʾ
	*/
	public static void main(String[] args) {
		Enum_Demo.weekOf(Enum_Demo.MON);
		System.out.println(Enum_Demo.FRI);
		System.out.println(Enum_Demo.SAT.name());  //ö�����name
		System.out.println(Enum_Demo.THURS.equals(Enum_Demo.FRI));
		Enum_Demo mon=Enum_Demo.valueOf("MON");
		System.out.println(mon.toString());   //���ַ���ת���ɶ�Ӧ��ö����
		
		Enum_Demo[] arr=Enum_Demo.values();  //��ȡ���е�ö�������������
		for (Enum_Demo d : arr) {
			System.out.print(d+"  ");
		}
	}
		
}
