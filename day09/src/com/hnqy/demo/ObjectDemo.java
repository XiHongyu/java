package com.hnqy.demo;
	/**
	*Object 类  所有类的父类
	*常用方法
	*	toString()返回当前对象的有关信息  按字符串类型返回
	*   equals()比较两个对象是否是同一个对象  是返回true
	*   hashCode()返回对象的哈希码值
	*   getClass() 获取当前对象所属的类信息
	*/
public class ObjectDemo {
	public static void main(String[] args) {
		//调用重写方法判断两个学生对象是否是同一个人
		demo1();
		
		//demo2();   //测试toString();方法
		 
		demo3();    //测试hashCode();方法
	}

	private static void demo3() {
		StudentDemo stu=new StudentDemo();
		int a=stu.hashCode();
		System.out.println(a);
		
	}

	private static void demo2() {
		//toString方法  返回当前对象的所有属相信息
		StudentDemo stu=new StudentDemo("刘备",34567,34);
		String str=stu.toString();
		System.out.println(str);
	}

	private static void demo1() {
		//创建学生类对象测试重写的equals方法
		StudentDemo stu1=new StudentDemo("张三胖",23456,23);
		StudentDemo stu=stu1;
		//同一个对象
		System.out.println(stu.equals(stu1));
		//不同对象   姓名相同  学号相同
		StudentDemo stu2=new StudentDemo("张三胖",23456,23);
		System.out.println(stu1.equals(stu2));
		//不同对象相同姓名 但学号不同
		StudentDemo stu3=new StudentDemo("张三胖",65433,24);
		System.out.println(stu3.equals(stu1));
	}
	
}

//定义一个类  重写equals方法
//如果学号和姓名都相同说明是同一个人
class StudentDemo{
	private String name;
	private int id;
	private int age;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public StudentDemo(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}


	public StudentDemo() {
		super();
		
	}

//重写equals方法
	@Override
	public boolean equals(Object o) {
		if(super.equals(o))
			return true;
		StudentDemo stu=(StudentDemo)o;
		if(this.id==stu.id && this.name.equals(stu.name)){
			return true;
		}
		return false;
	}


	//重写toString方法  返回当前对象的说有属性
	@Override
	public String toString() {
		
		return name+"  "+id+"  "+age;
	}


	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	
}
	
	
	

