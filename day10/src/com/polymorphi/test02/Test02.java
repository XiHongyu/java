package com.polymorphi.test02;

import java.util.Scanner;

public class Test02 {
	/**
	 *����˵��
			�Զ�����ͷ�����ʹ�ø�����Ϊ����ֵʵ�ִ�ӡ��ͬ������Ʒ�۸���
			���ࣺGoods����Ʒ�ࣩ
			���ࣺTVs�������ࣩ��Foods��ʳƷ�ࣩ
	 *������
	 *		1.�Զ�����Ʒ��  ������Ʒ���������Լ۸�
	 *		2.����������̳и���۸����Բ����ò�ͬ�۸�
	 *		3.���������ü۸�ķŷ������ظ�������������
	 *		4.�����ӡ�۸񷽷������ո������ò�����ת�ʹ�ӡ������Ʒ�ļ۸�
	 *	
	 */
	public static void main(String[] args) {
		setGoods().print();
	}
	
	public static Goods setGoods(){
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ʒ���ͣ�(1.TV/2.ʳƷ)");
		if(sc.nextInt()==1)
		     return new TVs("����",2000);
		return new Foods("����",0.5);
	}
}
