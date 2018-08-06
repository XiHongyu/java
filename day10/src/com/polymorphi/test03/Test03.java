package com.polymorphi.test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Person p=new Person();
		p.account(p.select());
	}
}

class Person{
	public Vehicle select(){
		Scanner sc=new Scanner(System.in);
		System.out.println("��ѡ��1.����/2.����");
		if(sc.nextInt()==1){
			return new Bicycle();
		}
		return new Car();
	}
	public void account(Vehicle v){
		Scanner sc=new Scanner(System.in);
		if(v instanceof Bicycle){
			Bicycle b=(Bicycle)v;
			System.out.println("������ʹ��ʱ�䣨min����");
			System.out.println("������"+b.count(sc.nextDouble()));
		}
		if(v instanceof Car){
			Car c=(Car)v;
			System.out.println("������ʹ������̣�km����ʱ�䣨min����");
			c.setMileage(sc.nextInt());
			System.out.println("�����ѣ�"+c.count(sc.nextDouble()));
		}
	}
	
}
