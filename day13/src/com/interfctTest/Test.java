package com.interfctTest;

public class Test {

	/**
	 *
	 */
	public static void main(String[] args) {
		Circle c=new Circle(4);  //创建一个圆的对象
		System.out.println("圆面积："+coundArea(c));
		System.out.println("圆周长："+coundPerimeter(c));
		
		Rectangle r=new Rectangle(4,5);   //创建一个矩形对象
		System.out.println("矩形面积："+coundArea(r));
		System.out.println("矩形周长："+coundPerimeter(r));
		
	}
	//传一个图像对象求该图像面积   该图形类必须实现求面积的接口
	public static double coundArea(Quadrature c){
		return c.getArea();
	}
	//传一个图形对象求该图像周长 该图形类必须实现求周长的接口
	public static double coundPerimeter(Perimeter per){
		return per.getPer();
	}
}
