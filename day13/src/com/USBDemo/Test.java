package com.USBDemo;

public class Test {
	public static void work(USBinterface usb){
		usb.loadDriver();
		
	}
	public static void main(String[] args) {
		//����һ��������
		Mouse m=new Mouse();
		work(m);
		
		//����һ��U�̶���
		USBFlash u=new USBFlash();
		work(u);
		
		//����һ�����ȶ���
		Fan f=new Fan();
		work(f);
	}
	
}
