package com.interfctTest;

public class Triangle implements Perimeter, Quadrature {
	private int a,b,c;
	
	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
		
	}

	@Override
	public double getArea() {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public double getPer() {

		return a+b+c;
	}
	/**
	*
	*/
}
