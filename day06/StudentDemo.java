public class StudentDemo{
	//��ڷ���
	public static void main(String[]args){
		//����һ��������ѧ������
		Student[] stus=new Student[5];
		//����ѧ�����󲢸�������ֵ
		for(int i=0;i<stus.length;i++){
			stus[i]=new Student();
			stus[i].name="ѧ��"+(i+1);
			//ѧ���ɷ����
			System.out.println(stus[i].name+"..."+stus[i].isFee);
			}
			for(int i=0;i<stus.length;i++){
				//ѧ���ɷѷ���
				stus[i].fees();
				//ѧ���ɷ����
				System.out.println(stus[i].name+"..."+stus[i].isFee);
			}
		
	}
}
//����һ��ѧ����
class Student{
	//ѧ������
	String name;
	//String id;
	//int age;
	boolean isFee;
	//ѧ������
	public void fees(){
		isFee=true;
	}
}