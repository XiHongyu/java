package com.polymorphi.test04;

public class Bicycle extends Share {
	
	public Bicycle() {
		super();	
	}
	public Bicycle(int time, double price) {
		super(time, price);	
	}
	@Override
	public double getprict() {
		int t=this.getTime()/60==0? this.getTime()/60 : this.getTime()/60+1;
		return t*this.getPrice();
	}
	
}
