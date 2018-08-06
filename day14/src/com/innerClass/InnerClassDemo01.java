package com.innerClass;

/**
 *��ĳ�Ա���ֶ� ���� ���
 *�ڲ��ࣺ
 *	������ڲ������࣬���Կ�����ĳ�Ա
 *	1.ʵ���ڲ��ࣺ 
 *	2.��̬�ڲ��ࣺ
 *	3.�ֲ��ڲ��ࣺ
 *	4.�����ڲ��� ��
 */
public class InnerClassDemo01 {
	//�ⲿ������
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public InnerClassDemo01(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public InnerClassDemo01() {
		super();	
	}
	//�ⲿ��ķ���
	public void methoA(){
		System.out.println(this.name+".."+this.age+"�ⲿ���Ա");
	}
	public static void methodB(){
		System.out.println("�ⲿ�ྲ̬����");
	} 
	/**
	 * ʵ���ڲ���  ���ڷ�����  û��static����  Ҳ�����о�̬��Ա
	 * ���η�:���з���Ȩ�����η�  �����ǳ�����abstract
	 **/
	 class Inner{
		//�ڲ����Ա ������static����
		String name;
		int age;
		public Inner(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public Inner() {
			super();
			
		}
		public void methoA(){
			System.out.println(name+"..."+age+"����ʵ���ڲ��෽��A");
		}
		public void methoB(){//�ڲ�������ⲿ���ⲿ����.this.������
			InnerClassDemo01.this.methoA();
		}
	}
	
	/**
	 * ��̬�ڲ���  static ����
	 * �����о�̬��ԱҲ�����зǾ�̬��Ա
	 * */
	static class Inner01{
		private String name;
		private int age;
		public Inner01() {
			super();	
		}
		public Inner01(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void methodA(){  //�ھ�̬�ڲ���ɴ����ⲿ���������ⲿ���ʵ����Ա  Ҳ����ֱ��ͨ���ⲿ�������ʾ�̬��Ա
			InnerClassDemo01 icd=new InnerClassDemo01("xixi",13);
			System.out.println(icd.getName());
			InnerClassDemo01.methodB();
			System.out.println("��̬�ڲ���Ǿ�̬����");
		}
		public static void methodB(){
			InnerClassDemo01 icd=new InnerClassDemo01("haha",12);
			System.out.println(icd.getName());
			System.out.println("��̬�ڲ��ྲ̬����");
		}
	}
	/**
	 * �ֲ��ڲ���
	 * 		�����ڷ����ڲ�����  �����ǳ���Ļ����յ�
	 * 
	 * */
	public void methodC(){
		int num=10;
		class Inner02{  //�ֲ��ڲ���ֻ���ڷ�����ʹ�ã��ֲ��ڲ�����Է����ⲿ������г�Ա�����ʷ����ڵľֲ���Աֻ�ܷ��ʳ���,jdk1.8֮������Ĭ����final���ε�
			public void methodD(){
				System.out.println("�ֲ��ڲ���");
			}
		}
		
		Inner02 inner=new Inner02();
		inner.methodD();
	}
	
	
	
}

