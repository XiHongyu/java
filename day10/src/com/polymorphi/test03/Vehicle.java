package com.polymorphi.test03;

/**
 *����һ������ͨ�����࣬�����и��ֽ�ͨ���ߵĹ������� ʹ��ʱ��͵���
 */
public abstract class Vehicle {
	private double totalPrice;  //�ܼ۸�   
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
	//�����ܼ۵ķ���
	public abstract double count(double time);
	
	
	
	
}
