package com.interfaceDemo;

public class FinalDemo {

	/**
	 *final最终的修饰符
	 *		final修饰类 表示最终类不能被继承   不能修饰抽象类
	 *		final修饰的方法表示最终方法 不能被重写    同样不能修饰抽象方法
	 *		final修饰的字段常量，值不能被改变，修饰引用数据类型时是地址值不能改变，里面内容还可以改变
	 *		用public static final 修饰的  变量名都想用大写  多个单词用下划线链接
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