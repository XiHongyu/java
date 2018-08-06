package com.interfctTest;

public class Circle implements Quadrature,Perimeter {
	private double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Circle() {
		super();
		
	}
	@Override
	public double getArea() {
		
		return Quadrature.PI*r*r;
	}
	@Override
	public double getPer() {
		
		return Perimeter.PI*r*2;
	}

	
}
