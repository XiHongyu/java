package com.USBDemo;

public class Mouse  implements USBinterface {

	@Override
	public void loadDriver() {
		System.out.println("�����������");
	}
	
	public void click(){
		System.out.println("���ͼ��");
	}
	
	
}
