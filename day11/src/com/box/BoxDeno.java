package com.box;

public class BoxDeno {

	/**
	 *基本类型包装类
	 *	作用：将基本数据类型封装成对象 可以再对象中定义更多的方法方便对数据的操作
	 *基本数据类型                          包装类
	 *  byte            Byte
	 *  short           Short
	 *  int             Integer
	 *  long            Long
	 *  float           Float
	 *  double          Double
	 *  char            Character
	 *  boolean        Boolean
	 *  
	 *  装箱：把基本类型转换成对相应的包装类类型
	 *  	手动装箱：1.通过Integer构造方法
	 *  		   2.通过Integer的静态方法  Integer.valueOf();
	 *  拆箱：把包装类类型转换成基本数据类型
	 *  	手动拆箱: 1.通过对象调用intValue()方法
	 *  JDK1.5之后可以自动装箱拆箱
	 */
	public static void main(String[] args) {
		//int的包装类 Integer
		
		//demo1();//Integer中的常量
		
		//demo();//进制转换
		
		//demo2();
		
		//手動裝箱
		     //1.构造方法 
				Integer i=new Integer(22);
			//2.静态方法
				Integer.valueOf(22);
		//手动拆箱
			i.intValue();
			
		//JDK1.5后可自动装箱拆箱
			Integer i1=22;  //自动装箱
			int i3=i;   //自动拆箱
		
			//int 类型转换成String类型
			int a=1234;
			String str=a+"";   //直接连接一个字符串
			String str1=String.valueOf(a); //string的静态方法
			String str2=Integer.toString(a);  //调用静态toString方法
			String str3=i.toString();     //调用非静态toString方法
			
			//String转int类型
			String s="12345";
			Integer is=new Integer(s);
			int a1=is.intValue();
			int a2=Integer.parseInt(s);
			
			
		
	}

	private static void demo2() {
		//初始化一个Integer对象
		Integer i=new Integer(10);
		Integer i2=new Integer("10");
		//比较两Integer对象的值  调用对象的值小返回-1  调用的值大 返回1  相同返回0
		int a5=i.compareTo(i2);
		System.out.println(a5);
		String str =Boolean.toString(false);
		System.out.println(str);
		int a4=Integer.bitCount(64); //返回指定 int 值的二进制补码表示形式的 1 位的数量。
		System.out.println(a4);
	};

	private static void demo() {
		//进制转换
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(16));
		System.out.println(Integer.toBinaryString(64)); //转换为二进制
		System.out.println(Integer.toHexString(15));   //十六进制
		System.out.println(Integer.toOctalString(64));  //八进制
	}

	private static void demo1() {
		int a=Integer.MAX_VALUE;  //最大的int数    2147483647
		System.out.println(a);
		int a1=Integer.MIN_VALUE;    //最小的int数  -2147483648
		System.out.println(a1);
		int a3=Integer.SIZE;      //int 类型的比特位数   32
		System.out.println(a3);
	}
}
