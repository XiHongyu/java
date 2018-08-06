package com.interfaceDemo;

public abstract class Geomety {
	
		public abstract double getArea();
}

class Circle extends Geomety{
	private double r;
	private final double PI=3.14;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle(double r) {
		super();
		this.r = r;
	}
	public Circle() {
		super();
		
	}
	public double getArea(){
		
		return PI*r*r;
	}
}
class Rectangle extends Geomety{
	private double grow;
	private double wide;
	public double getGrow() {
		return grow;
	}
	public void setGrow(double grow) {
		this.grow = grow;
	}
	public double getWide() {
		return wide;
	}
	public void setWide(double wide) {
		this.wide = wide;
	}
	public Rectangle(double grow, double wide) {
		super();
		this.grow = grow;
		this.wide = wide;
	}
	public Rectangle() {
		super();
		
	}
	@Override
	public double getArea() {
		
		return grow*wide;
	}
	
}
