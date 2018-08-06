package com.interfaceDemo;

public class ExceptionDemo {

	/**
	 *异常处理
	 *	try 。。 catch 。。finally 处理异常
	 *格式：
		try{
			//可能出现异常的代码
			//如果没有发生异常，就正常执行try中代码
			//如果发生异常，这个时候JVM会把异常做成一个对象。
			//把这个异常对象赋值给catch()中的变量
			//赋值玩了之后，去执行catch中的模块
		}catch(异常类型 变量名){		
			//如果发生异常，就执行catch模块
			e.printStackTrace();
		}finally{
			//无论上边是否发生异常，finally都正常执行
		}
	 */
	public static void demo(){
		try{
			int a=22;
			int b=0;
			System.out.println(a/b);  
		}catch(Exception e){
			
			System.out.println("除数能是零");
			e.printStackTrace();  //打印出栈和堆中所有的异常信息
			return;
		}finally{    //finally 遇到return语句也会执行  执行完finally的语句后返回
			System.out.println("异常处理完毕");
		}
		
		
		
	}
	public static void main(String[] args){
		//demo();
		try{
			test(160);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	//自定义内部类测试
	public static void test(int age)throws CustomException{
		if(age>0&&age<150){
			System.out.println(age);
		}else{
			throw new CustomException("你是神吧？");
		}
	}	
}
//自定义一个异常类 必须继承Exception类
class CustomException extends Exception{
	
	public CustomException() {
		super();
	}
	public CustomException(String message) {  //可打印出错误信息
		super(message);	
	}	
}
