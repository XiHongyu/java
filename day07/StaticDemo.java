
public class StaticDemo{
	public static void main(String[]args){
		/**
				static��̬���η� ���������ֶΣ��������ڲ���
				static���εĳ�Ա���ص㣺
					static���εĳ�Ա������ ������ļ��ض����� �����ڶ������
					static���εĳ�Ա����Ҫʵ�������󣬿���ͨ������.����
					static���εķ���ֻ�ܷ��ʸ�����static���εĳ�Ա
					�Ǿ�̬�ļȿ��Է��ʾ�̬��Ҳ���Է��ʷǾ�̬��
					static���εĳ�Ա�������ڴ�ķ�����������������ж���������
				static��ȱ�㼰ʹ�ó�����
					�ŵ㣺��ʡ�ڴ�ռ䲻��Ҫ��������
					ȱ�㣺�������ڳ�
				�������ĳ��Ա������ʱʹ��static���Σ��������þ�̬�������÷Ǿ�̬	
		*/
	
		
		//����һ��Ա������1     
			Staff s1=new Staff("��Ʒ����");
			//s1.company="����";
			s1.salary=8000;
			s1.name="����";
			
		//����һ��Ա������2
			Staff s2=new Staff("���ž���");
			//s2.company="����";
			s2.salary=6000;
			s2.name="����";
			
		//����Ա������ͬһ����˾ ��˾������static���� ��������ֵ
		Staff.company="����";
		
		//�鿴Ա����Ϣ
		s1.lookOver();
		s2.lookOver();
		s1.punchCard();  //��̬�������ö���������
		
		Staff.punchCard(); //Ҳ�������������� ����Ҫ��������
	}
}

//��������һ��Ա����
class Staff{
	//����
	static String company;
	String duty;
	int salary;
	String name;
	//�ղι���
	public Staff(){}
	//�вι���
	public Staff(String duty){
		this.duty=duty;
	}
	//�Ǿ�̬���Է��ʾ�̬
	public void lookOver(){
		System.out.println(name +"..."+company+"..."+duty+"..."+salary);
	}
	
	public static void punchCard(){
		//System.out.println(name);  �����޷��Ӿ�̬����������Ǿ�̬����   ��̬���ܷ��ʷǾ�̬
		System.out.println("�ϰ࿨");
	}
	
	public void work(){
		System.out.println("�ô���");
	}
	
	
	
	
	
}