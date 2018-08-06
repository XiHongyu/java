package com.interfctTest;
//共享单车  每小时一块前  不满一小时按一小时计算
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

//共享小汽车   每小时三块钱，10公里之内不用附加前  超过十公里每多一公里多付一块钱

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