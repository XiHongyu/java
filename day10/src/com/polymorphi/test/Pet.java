package com.polymorphi.test;

/**
 *������
 *  ����Ҫ����������󣬲�Ҫ�������ﶼ��д�ԷǷ������Խ����ඨ��Ϊ������
 */
public abstract class Pet {
	private int health;  //����ֵ

	
	public Pet(int health) {
		super();
		this.health = health;
	}

	public Pet() {
		super();
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	

	//���󷽷���   ����Ҫ�Է���false
	public abstract void eat();
	//�ǳ��󷽷��ж��Ƿ���Ҫ��
	public boolean judge(){
		if(this.getHealth()<100){
			return true;
		}else{
			System.out.println("�Ա��˳Ա���");
			return false;
		}
	}
	
	
}
