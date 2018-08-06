package com.interfaceDemo;
/**
 * 定义一个接口
 * 	修饰符    interface  接口名
 * 	接口中的方法全部是抽象方法  默认用public abstract  修饰
 * 	接口中的变量全部是常量 默认用你public static final 修饰  定义时必须附上初始值
 * 	接口中不能有构造方法
 * 
 * */
public interface Lock {
	void shangLock();
	void unLock();
	
}
