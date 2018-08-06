package com.polymorphi.test;

/**
 *定义一个主人类为宠物喂食  类中方法都是静态的可以定义成抽象类不让其他类创建该类对象
 */
public abstract class Master {
	//将喂食方法用static修饰可以直接用类名调用 不需要创建其对象
	public static void feed(Pet p){
		while(p.judge()){
			p.eat();
		}
		//父类引用无法访问子类特有的方法，需要向下转型 加强制转换符  强制转换会出现类型转换异常需用 instanceof判断对象是否是该类型
		if(p instanceof Dog){  //判断p是不是Dog类
			Dog d=(Dog)p; //向下转型为Dog类型
			d.frisbee();
		}
		if(p instanceof Penguin){  //判断p是不是Penguin类
			Penguin pg=(Penguin)p;  //向下转为Penguin类型
			pg.dive();
		}
	}
}
