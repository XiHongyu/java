package com.USBDemo;

public class Fan implements USBinterface {

	@Override
	public void loadDriver() {
		System.out.println("���ط�������");
	}
	
	public void air(){
		System.out.println("ɢ��");
	}
}
