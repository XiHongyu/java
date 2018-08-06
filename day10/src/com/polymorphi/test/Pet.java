package com.polymorphi.test;

/**
 *宠物类
 *  不需要创建该类对象，并要求给类宠物都重写吃非方法所以将该类定义为抽象类
 */
public abstract class Pet {
	private int health;  //健康值

	
	public Pet(int health) {
		super();
		this.health = health;
	}

	public Pet() {
		super();
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	

	//抽象方法吃   不休要吃返回false
	public abstract void eat();
	//非抽象方法判断是否需要吃
	public boolean judge(){
		if(this.getHealth()<100){
			return true;
		}else{
			System.out.println("吃饱了吃饱了");
			return false;
		}
	}
	
	
}
