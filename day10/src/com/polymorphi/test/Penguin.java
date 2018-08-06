package com.polymorphi.test;

/**
 *定义一个企鹅类继承宠物类并重写其吃方法
 */
public class Penguin extends Pet{
	
	public Penguin() {
		super();
		
	}

	public Penguin(int health) {
		super(health);
		
	}

	@Override
	public void eat() {
			System.out.println("吃鱼吃鱼吃鱼");
			this.setHealth(this.getHealth()+5);
	}
	//企鹅特有的方法 潜水
	public void dive(){
		System.out.println("下水捕鱼");
	}
	
	
}
