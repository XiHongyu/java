package com.polymorphi.test02;

/**
 *商品类
 *	1.自定义商品类  给出商品公共的属性价格
 */
public abstract class Goods {
	 private double price;
	 private String brand;
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Goods(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	public Goods() {
		super();
	}

	public Goods(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void print(){
		System.out.println(this.getBrand()+"..."+this.getPrice());
	}
	
	
}
