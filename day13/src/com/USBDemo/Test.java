package com.USBDemo;

public class Test {
	public static void work(USBinterface usb){
		usb.loadDriver();
		
	}
	public static void main(String[] args) {
		//创建一个鼠标对象
		Mouse m=new Mouse();
		work(m);
		
		//创建一个U盘对象
		USBFlash u=new USBFlash();
		work(u);
		
		//创建一个风扇对象
		Fan f=new Fan();
		work(f);
	}
	
}
