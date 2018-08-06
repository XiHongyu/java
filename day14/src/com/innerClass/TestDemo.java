package com.innerClass;

public class TestDemo {
	
	public static void main(String[] args) {
		//livingInsideClass(); //实例没内部类演示
		//staticInsideClass();//静态内部类演示
		InnerClassDemo01 ic=new InnerClassDemo01();   //局部内部类测试
		ic.methodC();
		
		//匿名内部类  必须继承与一个抽象类或者实现某个接口
		Myinterface face=new Myinterface() {
			//实现类的放法体  重写接口的抽象方法
			@Override
			public void methodA() {
				System.out.println("匿名内部类");
			}
		};
		face.methodA();
		
		
		
		
	}

	private static void staticInsideClass() {
		//静态内部类  实例化对象
		InnerClassDemo01.Inner01 i1=new InnerClassDemo01.Inner01("张三", 23);
		i1.methodA();  //对象名调用实例方法   
		i1.methodB();  //对象名调用静态方法  静态方法内部创建外部类对象 访问外部类实例方法
		
		//对象名直接调用静态方法
		InnerClassDemo01.Inner01.methodB();
	}

	private static void livingInsideClass() {
		//初始化外部类对象
		InnerClassDemo01 icd=new InnerClassDemo01("李四",24);
		
		//icd.methoA();   //外部类对象访问外部类方法
		//初始化一个内部类的对象  先有外部类对象后又内部类
		InnerClassDemo01.Inner inner=icd.new Inner("张三",23);
		inner.methoA();   	//内部类对象访问内部类方法
		inner.methoB();		//内部类方法调用外部类方法
		
		//匿名外部类直接给初始化外部类
		InnerClassDemo01.Inner in=new InnerClassDemo01("外王五",24).new Inner("王五", 25);
		in.methoA();   //内部类对象方位内部内方法
		in.methoB();   //访问外部成员可以通过内部类访问
	}
}
