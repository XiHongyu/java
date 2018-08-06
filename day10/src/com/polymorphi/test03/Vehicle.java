package com.polymorphi.test03;

/**
 *定义一个共享交通工具类，该类有各种交通工具的公共属性 使用时间和单价
 */
public abstract class Vehicle {
	private double totalPrice;  //总价格   
	public Vehicle() {
		super();	
	}
	
	public Vehicle(double totalPrice) {
		super();
		this.totalPrice = totalPrice;
		
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	//计算总价的方法
	public abstract double count(double time);
	
	
	
	
}
