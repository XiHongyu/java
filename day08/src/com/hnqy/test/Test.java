package com.hnqy.test;

import com.hnqy.bean.Student;

public class Test {
	/**
	*������  ���Է���Ȩ�����η�
	*		 private˽�е�   
	*		   Ĭ�����η�   
	*		protected�ܱ�����
	*		public������
	*
	*/
	private String name;
	private void print(){
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		//private������ͬһ�����ڿ��Է���
		t.name="haha";
		t.print();
		
		//private�����ڲ�ͬ�����޷�����
		StudentDemo sd=new StudentDemo();
		//sd.name="";
		//sd.print();
		
		//Ĭ�����η�������ͬһ���¿��Է���
		StudentDemo01 sd1=new StudentDemo01();
		sd1.name="xixi";
		sd1.print();
		
		//Ĭ�����η��ڲ�ͬ�����޷�����
		Student stu=new Student();
		//stu.name="";
		
		//public ���β�ͬ���·���
		stu.age=23;
		stu.print();
		
	}
	
}

 class StudentDemo{
	private String name;
	private void print(){
		System.out.println(name);
	}

}
