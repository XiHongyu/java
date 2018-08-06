package com.interfaceDemo;

public class Note {
	/**
	 * 深入了解面向对象
	 *  代码块  在类或方法中  用{}括起来的内容都叫代码块
	 *		局部代码块：方法内   方法调用时执行 没调用一次 就执行一次
	 *		初始化代码块：类内方法外，没有任何修饰  创建对象时在构造方法前执行 每创建一次对象执行一次
	 *		构造代码块：构造方法 初始化对象时执行一次
	 *		静态代码块： static 修饰  类加载入jvm是执行一次 用于程序执行时加载驱动等
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
	//局部代码块   方法内   方法调用时执行 没调用一次 就执行一次
	public void print(){
		System.out.println("局部代码块");
	}
	//初始化代码块  类内方法外，没有任何修饰  创建对象时在构造方法前执行 每创建一次对象执行一次
	{
		System.out.println("初始化代码块");
	}
	//静态代码块  static 修饰  类加载入jvm是执行一次
	static{
		System.out.println("静态代码块");
	}
	//构造代码块   构造方法 初始化对象时执行一次
	public Note(){
		System.out.println("构造代码块");
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
