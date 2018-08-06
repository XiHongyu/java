package com.interfctTest;

public class Rectangle implements Quadrature, Perimeter {
	int length;
	int wide;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWide() {
		return wide;
	}
	public void setWide(int wide) {
		this.wide = wide;
	}
	public Rectangle(int length, int wide) {
		super();
		this.length = length;
		this.wide = wide;
	}
	public Rectangle() {
		super();
		
	}
	@Override
	public double getArea() {
		
		return length*wide;
	}
	@Override
	public double getPer() {
		
		return 2*(length+wide);
	}
}
