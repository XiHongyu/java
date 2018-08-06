
package com.interfaceDemo01;
/**
 * 接口可以继承接口，并且一个接口可以同时继承多个接口
 * 		interface 接口a extends 接口1,接口2,...
 * 
 * */
public interface FaceDemoA {
	void methodA();
}

interface FaceDemoB{
	void methodB();
}

interface FaceDemoC extends FaceDemoA,FaceDemoB{
	void methodC();
}
//一个类实现一个接口必须重写该接口以及该接口的父类的所有方法
class ClassA implements FaceDemoC{
	@Override
	public void methodA() {
	}
	@Override
	public void methodB() {
	}
	@Override
	public void methodC() {
	}
	
}

 abstract class ClassB implements FaceDemoC{
	//抽象类实现接口时可以不对接口中的方法进行重写
}
