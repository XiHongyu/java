package com.hqy.test;

import com.hnqy.demo.Person;
import com.hnqy.demo.Student;
import com.hnqy.demo.SuperMan;

public class TestDemo1 {
	/**
	*
	*/
	public static void main(String[] args) {
		//����ѧ�������  ִ�����๹�췽�������ȷ��ʸ���Ĺ��췽��
		Student stu=new Student();
		stu.showFu();
		Student stu1=new Student("haha",34);
		stu1.showFu();
		
		//demo1();
	}

	private static void demo1() {
		//������ �̳и�������� ��д�����eat����
		SuperMan sm=new SuperMan("�����ӳ�",100);
		System.out.println(sm.getName()+".."+sm.getAge());
		sm.fly();
		
		Person p=new Person("����",23);
		System.out.println(p.getName()+".."+p.getAge());
		p.eat();
		//��������ָ���������    
		Person p1=new SuperMan("���",25);
		System.out.println(p1.getName()+".."+p1.getAge());
		//���뿴���  ���п��ұ�  ����ʹ�ó������еķ���
		p1.eat();
		//��̬�������뿴���  ���п����  ��̬����������  �㲻����д 
		p1.sleep();
		//����ת��  ���˱���
		SuperMan sm1=(SuperMan)p1;
		System.out.println(sm1.getName()+".."+sm1.getAge());
		sm1.fly();
		sm1.sleep();
	}

}
