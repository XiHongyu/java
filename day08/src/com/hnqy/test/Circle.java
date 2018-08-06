
package com.hnqy.test;

import java.util.Scanner;

//圆类
public class Circle {
	/**
	 *求点与圆的关系  点在圆上  在圆内  在圆外
	 */

	public static void main(String[] args) {
		//创建有个圆对象
		Circle c=new Circle(2,3,5);
		//创建一个点对象
		Dot d=new Dot(7,8);
		//调用方法判断点与圆的位置关系
		String s=c.judge(d);
		System.out.println("圆("+d.getX()+","+d.getY()+")"+s);
		
		Dot d1=new Dot(3,3);
		System.out.println("圆("+d1.getX()+","+d1.getY()+")"+c.judge(d1));
		
		//创建键盘录入对象  通过键盘录入点的坐标
		Scanner sc=new Scanner(System.in);
		Dot d2=new Dot(sc.nextInt(),sc.nextInt());
		System.out.println("圆("+d2.getX()+","+d2.getY()+")"+c.judge(d2));
		
	}
	//圆心
	private int x,y;
	//半径
	private double r;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle(int x, int y, double r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public Circle() {
		super();
		
	}

	//judge  判断  定义一个判断的方法
	public String judge(Dot dot){
		int a=dot.getX();
		int b=dot.getY();
		if((a-x)*(a-x)+(b-y)*(b-y)<r*r)
			return "点在圆内";
		if((a-x)*(a-x)+(b-y)*(b-y)>r*r)
			return "点在圆外";
		
		return "点在圆上";
	}
}

//点类
class Dot{
	private int x;
	private int y;
	public Dot() {
		super();
		
	}
	public Dot(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
