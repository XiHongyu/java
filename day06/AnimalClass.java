public class AnimalClass{
	//��ڷ���
	public static void main(String[]args){
		Cat c=new Cat();
		c.colour="��";
		c.legs=4;
		System.out.println(c.colour+"...."+c.legs);
		c.cry();
		
		Dog d=new Dog();
		d.colour="��";
		d.legs=4;
		System.out.println(d.colour+"...."+d.legs);
		d.cry();
	}
}
//����һ��������
class Animal{
	//����
	int legs;   
	String colour;
	//��Ϊ
	public void cry(){
		System.out.println("��");
	}
	public void eat(){
		System.out.println("��");
	}
}
//è��̳ж����������
class Cat extends Animal{
	//��д���෽��
	public void cry(){
		System.out.println("������");
	}
	public void eat(){
		System.out.println("è����");
	}
	//è���еķ���
	public void catchMouse(){
		System.out.println("ץ����");
	}
}
//����̳ж����������
class Dog extends Animal{
	//��д���෽��
	public void cry(){
		System.out.println("������");
	}
	public void eat(){
		System.out.println("������");
	}
	//�����еķ���
	public void lookHome(){
		System.out.println("����");
	}
}