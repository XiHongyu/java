package com.polymorphi.test04;

/**
 *����һ���������� �ṩ�����������е����Լ��ŷ�  
 */
public abstract class Share {
	private int time; //ʹ��ʱ��
	private double price;  //ʹ�õ���
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
	//�����ܼ۵ķ���
	public abstract double getprict();
}
