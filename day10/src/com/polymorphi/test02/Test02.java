package com.polymorphi.test02;

import java.util.Scanner;

public class Test02 {
	/**
	 *需求说明
			自定义类和方法，使用父类作为返回值实现打印不同类型商品价格功能
			父类：Goods（商品类）
			子类：TVs（电视类）、Foods（食品类）
	 *分析：
	 *		1.自定义商品类  给出商品公共的属性价格
	 *		2.定义多个子类继承父类价格属性并设置不同价格
	 *		3.定义是设置价格的放法，返回父类有引用类型
	 *		4.定义打印价格方法，接收父类引用并向下转型打印个类商品的价格
	 *	
	 */
	public static void main(String[] args) {
		setGoods().print();
	}
	
	public static Goods setGoods(){
		Scanner sc=new Scanner(System.in);
		System.out.println("输入商品类型：(1.TV/2.食品)");
		if(sc.nextInt()==1)
		     return new TVs("长虹",2000);
		return new Foods("卫龙",0.5);
	}
}
