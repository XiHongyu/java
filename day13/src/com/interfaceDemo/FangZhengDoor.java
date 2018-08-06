package com.interfaceDemo;

/**
 * 实现接口
 * 修饰符  class 类名    [extends 父类名]  implements  接口名1,接口名2,...{
 * 			实现接口必修重写接口的所有方法
 * 			一个类可以实现多个接口，接口间用逗号分隔
 * }
 * 
 *方正门业生产的门  继承门类  并实现锁接口
 */
public class FangZhengDoor extends Door implements Lock {

	@Override
	public void shangLock() {
		System.out.println("锁门");
	}

	@Override
	public void unLock() {
		System.out.println("钥匙开锁");
	}
	
}
