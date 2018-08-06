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
 *������֪�����ڿ���̨���30 ��20 ��10
 */
class ExernalClass{
	private int num=10;
	class InnerClass{
		private int num=20;
		public void show(){
			int num=30;
			System.out.println(num);  //�ͽ�ԭ��ֲ�����
			System.out.println(this.num);    //��Ա����this.����
			System.out.println(ExernalClass.this.num);    //�����ⲿ���Ա�����޶����ⲿ�����ͻ���ⲿ������ ExernalClass.this.����
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



