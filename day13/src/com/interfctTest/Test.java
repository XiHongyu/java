package com.interfctTest;

public class Test {

	/**
	 *
	 */
	public static void main(String[] args) {
		Circle c=new Circle(4);  //����һ��Բ�Ķ���
		System.out.println("Բ�����"+coundArea(c));
		System.out.println("Բ�ܳ���"+coundPerimeter(c));
		
		Rectangle r=new Rectangle(4,5);   //����һ�����ζ���
		System.out.println("���������"+coundArea(r));
		System.out.println("�����ܳ���"+coundPerimeter(r));
		
	}
	//��һ��ͼ��������ͼ�����   ��ͼ�������ʵ��������Ľӿ�
	public static double coundArea(Quadrature c){
		return c.getArea();
	}
	//��һ��ͼ�ζ������ͼ���ܳ� ��ͼ�������ʵ�����ܳ��Ľӿ�
	public static double coundPerimeter(Perimeter per){
		return per.getPer();
	}
}
