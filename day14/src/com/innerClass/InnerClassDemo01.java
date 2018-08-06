package com.innerClass;

/**
 *类的成员：字段 方法 类等
 *内部类：
 *	在类的内部定义类，可以看做类的成员
 *	1.实例内部类： 
 *	2.静态内部类：
 *	3.局部内部类：
 *	4.匿名内部类 ：
 */
public class InnerClassDemo01 {
	//外部类属性
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public InnerClassDemo01(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public InnerClassDemo01() {
		super();	
	}
	//外部类的方法
	public void methoA(){
		System.out.println(this.name+".."+this.age+"外部类成员");
	}
	public static void methodB(){
		System.out.println("外部类静态方法");
	} 
	/**
	 * 实例内部类  类内方法外  没有static修饰  也不能有静态成员
	 * 修饰符:所有访问权限修饰符  可以是抽象类abstract
	 **/
	 class Inner{
		//内部类成员 不能有static修饰
		String name;
		int age;
		public Inner(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public Inner() {
			super();
			
		}
		public void methoA(){
			System.out.println(name+"..."+age+"我是实例内部类方法A");
		}
		public void methoB(){//内部类调用外部类外部类名.this.方法名
			InnerClassDemo01.this.methoA();
		}
	}
	
	/**
	 * 静态内部类  static 修饰
	 * 可以有静态成员也可以有非静态成员
	 * */
	static class Inner01{
		private String name;
		private int age;
		public Inner01() {
			super();	
		}
		public Inner01(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void methodA(){  //在静态内部类可创建外部类对象访问外部类的实例成员  也可以直接通过外部类名放问静态成员
			InnerClassDemo01 icd=new InnerClassDemo01("xixi",13);
			System.out.println(icd.getName());
			InnerClassDemo01.methodB();
			System.out.println("静态内部类非静态方法");
		}
		public static void methodB(){
			InnerClassDemo01 icd=new InnerClassDemo01("haha",12);
			System.out.println(icd.getName());
			System.out.println("静态内部类静态方法");
		}
	}
	/**
	 * 局部内部类
	 * 		定义在方法内部的类  可以是抽象的或最终的
	 * 
	 * */
	public void methodC(){
		int num=10;
		class Inner02{  //局部内部类只能在方法中使用，局部内部类可以访问外部类的所有成员，访问方法内的局部成员只能访问常量,jdk1.8之后他会默认是final修饰的
			public void methodD(){
				System.out.println("局部内部类");
			}
		}
		
		Inner02 inner=new Inner02();
		inner.methodD();
	}
	
	
	
}

