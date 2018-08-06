package com.USBDemo;

public class USBFlash implements USBinterface {

	@Override
	public void loadDriver() {
		System.out.println("加载U盘驱动");
	}
	
	public void resrive(){
		System.out.println("存储数据");
	}
}
