package com.USBDemo;

public class USBFlash implements USBinterface {

	@Override
	public void loadDriver() {
		System.out.println("����U������");
	}
	
	public void resrive(){
		System.out.println("�洢����");
	}
}
