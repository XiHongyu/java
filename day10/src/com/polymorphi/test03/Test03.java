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
		System.out.println("请选择：1.单车/2.汽车");
		if(sc.nextInt()==1){
			return new Bicycle();
		}
		return new Car();
	}
	public void account(Vehicle v){
		Scanner sc=new Scanner(System.in);
		if(v instanceof Bicycle){
			Bicycle b=(Bicycle)v;
			System.out.println("请输入使用时间（min）：");
			System.out.println("共消费"+b.count(sc.nextDouble()));
		}
		if(v instanceof Car){
			Car c=(Car)v;
			System.out.println("请输入使用总里程（km）和时间（min）：");
			c.setMileage(sc.nextInt());
			System.out.println("共消费："+c.count(sc.nextDouble()));
		}
	}
	
}
