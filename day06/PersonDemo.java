/**
	�����ࣺ
		[���η�] class ����{
			//����   ��Ա����
			��������  ������;
			//��Ϊ   ��Ա����
			[���η�] ����ֵ���� ������(�����б�){
				������
				}
		}
	�������� ʵ�����ࣺ
	���� ������=new ����();
	//�������Ը�ֵ
	������.����=value;
	//��ȡ����ֵ
	��������  ������=������.���ԣ�
	//ִ�ж�����Ϊ
	������.������();
*/
public class PersonDemo{
	//��ڷ���
	public static void main(String[]args){
		//�����������
		Person p1=new Person();
		//Ϊ���Ը�ֵ  ͨ��������.����=value;
		p1.name="����";
		p1.age=23;
		p1.sex="��";
		//��ȡ���Ե�ֵ   ������.����;
		System.out.println(p1.name+"..."+p1.age+"..."+p1.sex);
		//���÷���    ������.������();
		p1.eat();
		
	}
}
//����һ��Person��
class Person{
	//���췽��
	public  Person(){
		System.out.println("���ǹ��췽��");
	}
	//����
	String name;  //����
	
	int age;         //����
	String sex;    //�Ա�
	
	//����
	public void eat(){     //�Է�
		System.out.println("���ڳԷ�");
	}
	public void sleep(){
		System.out.println("����˯��");
	}
}