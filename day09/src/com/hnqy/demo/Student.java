package com.hnqy.demo;

/**
 *子类继承父类
 *	可以继承父类公共的属性和方法，私有的不能被继承
 *	关键字extends
 *	java只只支持单继承（只有一个父亲）
 *	子类可以有自己的特性
 *
 *	当子类有与父类相同的属性和行为时用super区分
 * super代表父类的 只能存在于子类的成员方法个构造方法中 ，在构造方法中必须是第一条语句
 * 如果子类构造方法中没写super语句那么会默认访问父类的无参构造
 * 创建对象时会先进行super语句执行父类构造
 * super同样无法访问父类私有的成员
 * 
 * 如果子类有属性和方法就不会再使用父类的  这时候如果还想使用父类的就用super访问父类中的成员
 *  */
public class Student extends Person {
	String ID;
	String name;

	public Student() {
		super();
		System.out.println("子类空参构造");
		
	}

	public Student(String name, int age) {
		super(name, age);
		System.out.println("子类有参构造");
		
	}
	public void showFu(){
		System.out.println(super.getName()+"..."+super.getAge());
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
