package com.polymorphi.test04;

public class Car extends Share {
	private int mileage;
	
	public Car() {
		super();	
	}
	public Car(int time, double price,int mileage) {
		this.setPrice(price);
		this.setTime(time);
		this.mileage=mileage;
		
	}
	@Override
	public double getprict() {
		int t=this.getTime()%10==0? this.getTime()/10:this.getTime()/10+1;
		if(this.mileage<=10){
		return t*this.getPrice();
		}else
			return t*this.getPrice()+(this.mileage-10)*1;
	}
	/**
	*
	*/
}
