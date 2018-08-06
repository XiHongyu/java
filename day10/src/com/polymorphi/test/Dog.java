package com.polymorphi.test;

/**
 *狗类继承宠物类 需要重写父类抽象方法
 */
public class Dog extends Pet{
	
	public Dog() {
		super();
		
	}
	public Dog(int health){
		super(health);
	}

	@Override
	public void eat() {
			System.out.println("吃肉吃肉吃肉");
			this.setHealth(this.getHealth()+3);
	}
	//狗类特有的方法  晚飞盘
	public void frisbee(){
		System.out.println("小狗接飞盘");
	}
}
