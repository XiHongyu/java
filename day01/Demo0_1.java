import java.util.Scanner;
public class Demo0_1{
	public static void main(String[]args){
		/**
			��ҵ��
			1.�ж�����ƽ��
			2.�ж�����ż��
			3.�����������ֵ��Сֵ
			Ҫ������Ԫ�����
		*/
		Scanner sc=new Scanner(System.in);
		//�ж�����ƽ��
		System.out.println("��������ݣ�");
		int year=sc.nextInt();
		String str= year%4==0&&year%100!=0||year%400==0 ? year+"������" : year+"��ƽ��";
		System.out.println(str);
		
		//�ж�����ż��
		System.out.println("����һ��������");
		int a=sc.nextInt();
		String str1= a%2==0 ? a+"��ż��" : a+"������";
		System.out.println(str1);
		
		//�����������ֵ��Сֵ
		System.out.println("������������");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double z=sc.nextDouble();
		double max= x>y ? x : y;
		max= max>z ? max : z;
		double min=x>y ? y:x;
		min=min<z ? min:z;
		System.out.println("���ֵΪ"+max+"����СֵΪ"+min);
		
	}	
}











