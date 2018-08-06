class Test_Teacher{
	public static void main(String[]args){
		MathTeacher mt=new MathTeacher("����",25);
		mt.teach();
	}
}
//����һ����ʦ��
abstract class Teacher {
	//����
	private String name;
	private int age;
	//�ղι���
	public Teacher(){}
	//�вι���
	public Teacher(String name,int age){
		this.name=name;
		this.age=age;
	}
	//�������� ����
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	//��ȡ���� ����
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	//��ʦ���е���Ϊ�Ͽ�
	public abstract void teach();
	
}
//��ѧ��ʦ��
class MathTeacher extends Teacher{
	//�ղι���
	public MathTeacher(){}
	//�вι���
	public MathTeacher(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("������ѧ��ʦ���ҽ�"+this.getName()+"�ҵ�����"+this.getAge());
	}
}
//������ʦ
class LanguageTeacher extends Teacher{
	//�ղι���
	public MathTeacher(){}
	//�вι���
	public MathTeacher(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("����������ʦ���ҽ�"+this.getName()+"�ҵ�����"+this.getAge());
	}
}