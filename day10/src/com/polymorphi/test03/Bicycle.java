package com.polymorphi.test03;

public class Bicycle extends Vehicle {
	private double price=0.6;  //¼Û¸ñ    Ôª/ min

	@Override
	public double count(double time) {
		if(time%60==0){
			return time/60*this.price;
		}
		return (time/60+1)*this.price;
	}
	
}
