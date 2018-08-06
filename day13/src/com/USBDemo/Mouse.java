package com.USBDemo;

public class Mouse  implements USBinterface {

	@Override
	public void loadDriver() {
		System.out.println("加载鼠标驱动");
	}
	
	public void click(){
		System.out.println("点击图标");
	}
	
	
}
