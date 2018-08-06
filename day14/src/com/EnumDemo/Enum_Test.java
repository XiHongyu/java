package com.EnumDemo;

public class Enum_Test {
	/**
	*枚举类常用方法演示
	*/
	public static void main(String[] args) {
		Enum_Demo.weekOf(Enum_Demo.MON);
		System.out.println(Enum_Demo.FRI);
		System.out.println(Enum_Demo.SAT.name());  //枚举项的name
		System.out.println(Enum_Demo.THURS.equals(Enum_Demo.FRI));
		Enum_Demo mon=Enum_Demo.valueOf("MON");
		System.out.println(mon.toString());   //将字符串转换成对应的枚举项
		
		Enum_Demo[] arr=Enum_Demo.values();  //获取所有的枚举项放入数字中
		for (Enum_Demo d : arr) {
			System.out.print(d+"  ");
		}
	}
		
}
