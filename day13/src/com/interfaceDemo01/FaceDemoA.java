
package com.interfaceDemo01;
/**
 * �ӿڿ��Լ̳нӿڣ�����һ���ӿڿ���ͬʱ�̳ж���ӿ�
 * 		interface �ӿ�a extends �ӿ�1,�ӿ�2,...
 * 
 * */
public interface FaceDemoA {
	void methodA();
}

interface FaceDemoB{
	void methodB();
}

interface FaceDemoC extends FaceDemoA,FaceDemoB{
	void methodC();
}
//һ����ʵ��һ���ӿڱ�����д�ýӿ��Լ��ýӿڵĸ�������з���
class ClassA implements FaceDemoC{
	@Override
	public void methodA() {
	}
	@Override
	public void methodB() {
	}
	@Override
	public void methodC() {
	}
	
}

 abstract class ClassB implements FaceDemoC{
	//������ʵ�ֽӿ�ʱ���Բ��Խӿ��еķ���������д
}
