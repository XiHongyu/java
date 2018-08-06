package com.EnumDemo;

public class Demo01_EnumClass {

	public static void main(String[] args) {
		EnumClass.weekOf(EnumClass.SUN);
	}
}
/**
 *自定义枚举类
 *MON("星期一") TUE("星期二")WED("星期三")THURS("星期四")FRI("星期五")SAT("星期六")SUN("星期日")
 */
class EnumClass {
	private EnumClass week;
	private EnumClass(){}  //私有构造方法  不让其他类在来创建该类对象
	//创建该类对象每一个表示一周对应的一天
	public static final EnumClass MON=new EnumClass();
	public static final EnumClass TUE=new EnumClass();
	public static final EnumClass WED=new EnumClass();
	public static final EnumClass THURS=new EnumClass();
	public static final EnumClass ERI=new EnumClass();
	public static final EnumClass SAT=new EnumClass();
	public static final EnumClass SUN=new EnumClass();
	//判断这一天是否休息  周六周日是休息日
	public static void weekOf(EnumClass week){
		if(week==SAT||week==SUN){
			System.out.println("今天是休息日");
		}else {
			System.out.println("老实上班");
		}	
	}	
}
