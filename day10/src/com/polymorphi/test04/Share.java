package com.polymorphi.test04;

/**
 *定义一个共享经济类 提供共享工具所共有的属性及放法  
 */
public abstract class Share {
	private int time; //使用时间
	private double price;  //使用单价
	public Share() {
		super();
		
	}
	public Share(int time, double price) {
		super();
		this.time = time;
		this.price = price;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//计算总价的方法
	public abstract double getprict();
}
