package com.hqy.test;

import com.hnqy.demo.Cat;
import com.hnqy.demo.Dog;

public class TestDemo2 {

	/**
	 *
	 */
	public static void main(String[] args) {
		//����һ��è��
		Cat c1=new Cat("��ɫ","�ӷ�è");
		c1.eat();
		c1.sleep();
		System.out.println(c1);
		
		//����һ������
		Dog d1=new Dog("��ɫ","���繷");
		d1.eat();
		d1.sleep();
	}
}
