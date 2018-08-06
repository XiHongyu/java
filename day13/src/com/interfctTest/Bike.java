package com.interfctTest;
//������  ÿСʱһ��ǰ  ����һСʱ��һСʱ����
public class Bike implements ShareEconomy {
	private int time;
	
	public Bike(int time) {
		super();
		this.time = time;
	}

	public Bike() {
		super();
		
	}

	@Override
	public double getTotal() {
		return time%60==0? time/60*1.0:(time/60+1)*1.0;
	}
}

//����С����   ÿСʱ����Ǯ��10����֮�ڲ��ø���ǰ  ����ʮ����ÿ��һ����ึһ��Ǯ

class Cat implements ShareEconomy{
	private int time;
	private int mileage;
	
	public Cat(int time, int mileage) {
		super();
		this.time = time;
		this.mileage = mileage;
	}

	public Cat() {
		super();
		
	}

	@Override
	public double getTotal() {
		int t=time%60==0? time/60 : time/60+1;
		return mileage<=10? t*3.0:t*3.0+(mileage-10)*1.0;
	}
}