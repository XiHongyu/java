package com.interfaceDemo;

/**
 * ʵ�ֽӿ�
 * ���η�  class ����    [extends ������]  implements  �ӿ���1,�ӿ���2,...{
 * 			ʵ�ֽӿڱ�����д�ӿڵ����з���
 * 			һ�������ʵ�ֶ���ӿڣ��ӿڼ��ö��ŷָ�
 * }
 * 
 *������ҵ��������  �̳�����  ��ʵ�����ӿ�
 */
public class FangZhengDoor extends Door implements Lock {

	@Override
	public void shangLock() {
		System.out.println("����");
	}

	@Override
	public void unLock() {
		System.out.println("Կ�׿���");
	}
	
}
