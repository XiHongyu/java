package com.EnumDemo;
/**
 * ö����
 * 		��ֱ�Ӷ���ö������ö����֮���ö��Ÿ�����������������룬ö���������ö����ĵ�һ��
 * 		���Զ��幹�췽��  ��������private����
 * 		Ҳ�����б���  ����  �ڲ����	
 * 
 * */
public enum Enum_Demo {
	MON("����һ"), TUE("���ڶ�"),WED("������"),THURS("������"),FRI("������"),SAT("������"),SUN("������");
	private String name;
	private Enum_Demo(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		
		return this.name;
	}
	public static void weekOf(Enum_Demo week){
		//switch��ʹ��ö��
		switch(week){
		case MON:
		case TUE:
		case WED:
		case THURS:
		case FRI:
			System.out.println("����");
			break;
		case SAT:
		case SUN:
			System.out.println("��Ϣ");
		}
	}
}

