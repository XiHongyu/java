package com.interfaceDemo;

public class ExceptionDemo {

	/**
	 *�쳣����
	 *	try ���� catch ����finally �����쳣
	 *��ʽ��
		try{
			//���ܳ����쳣�Ĵ���
			//���û�з����쳣��������ִ��try�д���
			//��������쳣�����ʱ��JVM����쳣����һ������
			//������쳣����ֵ��catch()�еı���
			//��ֵ����֮��ȥִ��catch�е�ģ��
		}catch(�쳣���� ������){		
			//��������쳣����ִ��catchģ��
			e.printStackTrace();
		}finally{
			//�����ϱ��Ƿ����쳣��finally������ִ��
		}
	 */
	public static void demo(){
		try{
			int a=22;
			int b=0;
			System.out.println(a/b);  
		}catch(Exception e){
			
			System.out.println("����������");
			e.printStackTrace();  //��ӡ��ջ�Ͷ������е��쳣��Ϣ
			return;
		}finally{    //finally ����return���Ҳ��ִ��  ִ����finally�����󷵻�
			System.out.println("�쳣�������");
		}
		
		
		
	}
	public static void main(String[] args){
		//demo();
		try{
			test(160);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	//�Զ����ڲ������
	public static void test(int age)throws CustomException{
		if(age>0&&age<150){
			System.out.println(age);
		}else{
			throw new CustomException("������ɣ�");
		}
	}	
}
//�Զ���һ���쳣�� ����̳�Exception��
class CustomException extends Exception{
	
	public CustomException() {
		super();
	}
	public CustomException(String message) {  //�ɴ�ӡ��������Ϣ
		super(message);	
	}	
}
