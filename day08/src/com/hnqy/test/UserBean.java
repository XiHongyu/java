package com.hnqy.test;
	/**
	 *声明一个User类  遵循JavaBean的规范
	 *1.类必须用public修饰
	 *2.提供公共的构造器
	 *3.字段用private修饰并提供公开的操作方法
	 *
	 */
public class UserBean {
	//设置属性将其私有
	private String name;
	private int age;
	private boolean sex;
	//无参构造
	public UserBean() {
		super();
		
	}
	//有参构造
	//this代表当前对象 谁来调用我我就代表谁 
	public UserBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//获取姓名
	public String getName() {
		return name;
	}
	//设置姓名
	public void setName(String name) {
		this.name = name;
	}
	//获取年龄
	public int getAge() {
		return age;
	}
	//设置年龄
	public void setAge(int age) {
		this.age = age;
	}
	//boolean类型的属型用 isXxx()方法获取其值
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
}
