package com.polymorphi.test;

/**
 *����һ��������Ϊ����ιʳ  ���з������Ǿ�̬�Ŀ��Զ���ɳ����಻�������ഴ���������
 */
public abstract class Master {
	//��ιʳ������static���ο���ֱ������������ ����Ҫ���������
	public static void feed(Pet p){
		while(p.judge()){
			p.eat();
		}
		//���������޷������������еķ�������Ҫ����ת�� ��ǿ��ת����  ǿ��ת�����������ת���쳣���� instanceof�ж϶����Ƿ��Ǹ�����
		if(p instanceof Dog){  //�ж�p�ǲ���Dog��
			Dog d=(Dog)p; //����ת��ΪDog����
			d.frisbee();
		}
		if(p instanceof Penguin){  //�ж�p�ǲ���Penguin��
			Penguin pg=(Penguin)p;  //����תΪPenguin����
			pg.dive();
		}
	}
}
