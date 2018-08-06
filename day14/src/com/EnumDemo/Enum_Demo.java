package com.EnumDemo;
/**
 * 枚举类
 * 		可直接定义枚举项，多个枚举项之间用逗号隔开，如果有其他代码，枚举项不许定义在枚举类的第一行
 * 		可以定义构造方法  但必须用private修饰
 * 		也可以有变量  方法  内部类等	
 * 
 * */
public enum Enum_Demo {
	MON("星期一"), TUE("星期二"),WED("星期三"),THURS("星期四"),FRI("星期五"),SAT("星期六"),SUN("星期日");
	private String name;
	private Enum_Demo(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		
		return this.name;
	}
	public static void weekOf(Enum_Demo week){
		//switch中使用枚举
		switch(week){
		case MON:
		case TUE:
		case WED:
		case THURS:
		case FRI:
			System.out.println("工作");
			break;
		case SAT:
		case SUN:
			System.out.println("休息");
		}
	}
}

