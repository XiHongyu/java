import java.util.*;
public class ArrayDemo{
	public static void main(String[]args){
		/**
			���飺������Կ���һ�����������ڴ�����ͬ���������͵Ķ��ֵ
				  ����ȿ��Դ��������������Ҳ���Դ��������������
			�﷨��
				������1.��������[] ������;  2.�������� ������[];
				��̬��ʼ������̬��ʼ����������=new ��������[���鳤��];
				����������ͬʱ��ʼ������������[] ������=new ��������[���鳤��];
				��̬��ʼ������������[] ������=new ��������[]{Ԫ��1,Ԫ��2,...};
					�ɼ򻯣���������[] ������={Ԫ��1,Ԫ��2,...};
		*/
		//��̬��ʼ��
		int arr1[]=new int[]{1,2,3,4,5};  //��̬��ʼ���������ڲ������峤��
		int[] arr2={11,22,33,44,55};   //ֻ����ͬһ�н���
		
		int[] arr5=new int[0];
		System.out.println(arr5);    //�������� �е�ֵַ����û�пռ� 
		
		//��̬��ʼ��
		String[] arr3=new String[5];   
		System.out.println(arr3);  //��ӡ���@15db9742 ����һ����ֵַ  
		//��̬��ʼ����ֵ
		arr3[0]="������";
		arr3[1]="�ȶ��Ǵ�";
		arr3[2]="����˹����";
		arr3[3]="�����˹";
		arr3[4]="���ɵ�";
		//arr3[5]="";   ���ʲ����ڵ�����  ArrayIndexOutOfBoundsException:��������Խ���쳣
		
		//�޸������е�ֵ
		arr3[2]="ղķ˹��˹��";
		
		//��ȡ�����е�ֵ
		String str=arr3[2];
		System.out.println(arr3[2]);   
		
		//arr2=null;                     //�������õ��ڿ� ����ָ����ڴ�
		//System.out.println(arr2[0]);  //NullPointerException:��ָ���쳣  
		
		//ͨ������¼���������Ԫ�ظ�ֵ
		Scanner sc=new Scanner(System.in);
		String[] arr4=new String[5];
		for(int i=0;i<arr4.length;i++){   //length��ȡ���鳤��
			arr4[i]=sc.next();
		}
		//�������
		for(String temp:arr4){
			System.out.print(temp+"\t");
		}
	}
}