package com.polymorphi.test03;

public class Car extends Vehicle {
	private double price=1.0;
	private int mileage;
	public Car() {
		super();
		
	}
	
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public double count(double time) {
		if(this.mileage<=10){
			if(time%10==0){
				return time/10*price;
			}
			return (time/10+1)*price;
		}
		if(time%10==0){
			return time/10*price+(this.mileage-10)*1;
		}
		return (time/10+1)*price+(this.mileage-10)*1;
		
	}
}
