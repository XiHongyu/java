//������
public class ClassDemo{
	public static void main(String[]args){
		//����һ��è����
		Cat cat=new Cat();
		cat.colour="��ɫ";
		cat.var="�ӷ�è";
		System.out.println(cat.colour+"..."+cat.var);
		cat.cat();
		//������������
		Dog dog=new Dog("ѩ��","����");
		System.out.println(dog.name+"..."+dog.sex);
		dog.cry();
		
	}
}


//����һ��è��
class Cat{
	//����
	String colour;  //��ɫ
	String var;     //Ʒ��
	//����
	public void cat(){
		System.out.println("������");
	}
	public void climb(){
		System.out.println("׽����");
	}
}
//����һ������
 class Dog{
	 //�ղι���
	 public Dog(){ 
	 }
	 //�вι���
	 public Dog(String name,String sex){
		this.name=name;
		this.sex=sex;
	 }
	 //����
	 String name;
	 String sex;
		//����
 public void cat(){
		 System.out.println("�й�ͷ");
	 }
	 public void cry(){
		 System.out.println("������");
	 }
}
//����
class Pig{
	//����
	String var;
	String colour;
	//�ղι���
	public Pig(){}
	//�вι���
	public Pig(String var,String colour){
		this.var=var;
		this.colour=colour;
	}
	
	//��Ϊ����
	public void sleep(){
		System.out.println("һ��˯20Сʱ");
	}
}
//����
class Fish{
	//����
	String water;//����ˮ��
	int weight;//����
	double price;//�۸�
	public void cook(){
		System.out.println("������");
	}
	
}
//����
class Bird{
	//����
	String variety;//Ʒ��
	
	public void fly(){
		System.out.println("װ�ɻ�");
	}
}
//�ֻ���
class Phone{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}
//������
class Computer{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}
//������
class TV{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}
//������
class Refrigerator{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}
//�յ���
class Conditioner{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}






