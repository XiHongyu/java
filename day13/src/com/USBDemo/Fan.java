package com.USBDemo;

public class Fan implements USBinterface {

	@Override
	public void loadDriver() {
		System.out.println("加载风扇驱动");
	}
	
	public void air(){
		System.out.println("散热");
	}
}
