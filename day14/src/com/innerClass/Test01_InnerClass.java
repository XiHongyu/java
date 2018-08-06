package com.innerClass;

public abstract class Test01_InnerClass {

	

	public static void main(String[] args) {
		ExernalClass.InnerClass ei=new ExernalClass().new InnerClass();
		ei.show();
		ExernalClass01.InnerClass01 ei1=new ExernalClass01.InnerClass01();
		ei1.show();
	}
}

/**
 *根据已知变量在控制台输出30 ，20 ，10
 */
class ExernalClass{
	private int num=10;
	class InnerClass{
		private int num=20;
		public void show(){
			int num=30;
			System.out.println(num);  //就近原则局部变量
			System.out.println(this.num);    //成员变量this.访问
			System.out.println(ExernalClass.this.num);    //访问外部类成员变量限定是外部类类型或的外部类引用 ExernalClass.this.访问
		}
	}
}

class ExernalClass01{
	private int num=10;
	static class InnerClass01{
		private int num=20;
		public void show(){
			int num=30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(new ExernalClass01().num);
		}
	}
}



