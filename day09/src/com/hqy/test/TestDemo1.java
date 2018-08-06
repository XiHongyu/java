package com.hqy.test;

import com.hnqy.demo.Person;
import com.hnqy.demo.Student;
import com.hnqy.demo.SuperMan;

public class TestDemo1 {
	/**
	*
	*/
	public static void main(String[] args) {
		//创建学生类对象  执行子类构造方法还会先访问父类的构造方法
		Student stu=new Student();
		stu.showFu();
		Student stu1=new Student("haha",34);
		stu1.showFu();
		
		//demo1();
	}

	private static void demo1() {
		//超人类 继承父类的属性 重写父类的eat方法
		SuperMan sm=new SuperMan("美国队长",100);
		System.out.println(sm.getName()+".."+sm.getAge());
		sm.fly();
		
		Person p=new Person("张三",23);
		System.out.println(p.getName()+".."+p.getAge());
		p.eat();
		//父类引用指向子类对象    
		Person p1=new SuperMan("大古",25);
		System.out.println(p1.getName()+".."+p1.getAge());
		//编译看左边  运行看右边  不能使用超人特有的方法
		p1.eat();
		//静态方法编译看左边  运行看左边  静态方法属于类  算不上重写 
		p1.sleep();
		//向下转型  超人变身
		SuperMan sm1=(SuperMan)p1;
		System.out.println(sm1.getName()+".."+sm1.getAge());
		sm1.fly();
		sm1.sleep();
	}

}
