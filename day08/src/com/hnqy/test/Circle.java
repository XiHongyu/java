
package com.hnqy.test;

import java.util.Scanner;

//Բ��
public class Circle {
	/**
	 *�����Բ�Ĺ�ϵ  ����Բ��  ��Բ��  ��Բ��
	 */

	public static void main(String[] args) {
		//�����и�Բ����
		Circle c=new Circle(2,3,5);
		//����һ�������
		Dot d=new Dot(7,8);
		//���÷����жϵ���Բ��λ�ù�ϵ
		String s=c.judge(d);
		System.out.println("Բ("+d.getX()+","+d.getY()+")"+s);
		
		Dot d1=new Dot(3,3);
		System.out.println("Բ("+d1.getX()+","+d1.getY()+")"+c.judge(d1));
		
		//��������¼�����  ͨ������¼��������
		Scanner sc=new Scanner(System.in);
		Dot d2=new Dot(sc.nextInt(),sc.nextInt());
		System.out.println("Բ("+d2.getX()+","+d2.getY()+")"+c.judge(d2));
		
	}
	//Բ��
	private int x,y;
	//�뾶
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

	//judge  �ж�  ����һ���жϵķ���
	public String judge(Dot dot){
		int a=dot.getX();
		int b=dot.getY();
		if((a-x)*(a-x)+(b-y)*(b-y)<r*r)
			return "����Բ��";
		if((a-x)*(a-x)+(b-y)*(b-y)>r*r)
			return "����Բ��";
		
		return "����Բ��";
	}
}

//����
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
