package com.hqy.test;

import com.hnqy.demo.Cat;
import com.hnqy.demo.Dog;

public class TestDemo2 {

	/**
	 *
	 */
	public static void main(String[] args) {
		//创建一个猫类
		Cat c1=new Cat("黄色","加菲猫");
		c1.eat();
		c1.sleep();
		System.out.println(c1);
		
		//创建一个狗类
		Dog d1=new Dog("白色","闪电狗");
		d1.eat();
		d1.sleep();
	}
}
