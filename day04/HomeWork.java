import java.util.*;
public class HomeWork{
	public static void main(String[]args){
		/**
			��һ�����飺8,4,2,1,23,344,12
			һ��������в���
			1.ѭ����������ֵ
			2.��������������ֵ�ĺ�
			3.����Ԫ�س��ֵ�����λ��
			4.����һ���� �ж��������Ƿ���ڸ���
		*/
		//����һ������ ����ֵ
		int[] arr={8,4,2,1,23,344,12};
		//ѭ����������е�ֵ
		for(int temp:arr){
			System.out.print(temp+"  ");
		}
		//���
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("����Ԫ�صĺͣ�"+sum);
		//��������һ��������Ԫ�س��ֵ�����  ���û����ʾû�ҵ�
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ������");
		int a=sc.nextInt();
		boolean b=true;
		for(int i=0;i<arr.length;i++){
			if(a==arr[i]){
				b=false;
				System.out.println(a+"��"+i+"������λ��");
				break;
			}
			
		}
		if(b){
				System.out.println("û���ҵ�"+a);
		}
	}
}