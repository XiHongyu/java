import java.util.*;
public class ArrayTwo{
	public static void main(String[]args){
		/**
		   ��ά����
		   ��ʼ����
				1.��������[][] ������=new ��������[����][����]; //��������������������Բ�д��ʹ��ʱ��̬����
				2.��������[][] ������={{1,23,},{...},{...},...};
			
		*/
		//��ά�����ʼ��
		int [][] arr1=new int[2][3];
		//��ֵ   ����ֵ��Ĭ�ϳ�ʼֵ
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		//ȡֵ
		int a=arr[0][0];
		int b=arr[0][1];
		int c=arr[0][2];
		System.out.println(a+"  "+b+"  "+c);
		
		
		//int[][] arr=new int[3][];
		//System.out.println(arr[0][0]);  //��ָ���쳣
		
		
		/**
			��ϰ�������༶��������ѧ����ʹ�ö�λ����������ܳɼ�
		*/
		//����һ����λ���� �д���༶  �д������ֵ�ÿ��ѧ���ĳɼ�
		int[][] stuArr=new int[3][5];
		Scanner sc=new Scanner(System.in);
		//ͨ�����������ѧ��¼��ɼ�
		for(int i=0;i<stuArr.length;i++){
			System.out.println(i+1+"��ÿ��ѧ���ĳɼ���");
			for(int j=0;j<stuArr[i].length;j++){
				stuArr[i][j]=sc.nextInt();
			}
		}
		int[] sum=new int[3];
		for(int i=0;i<stuArr.length;i++){
			System.out.println("*****"+(i+1)+"���ѧ���ɼ�"+"*****");
			for(int j=0;j<stuArr.length;j++){
				System.out.println(i+1+"���"+(j+1)+"��ѧ���ĳɼ���"+stuArr[i][j]);
				sum[i]+=stuArr[i][j];
			}
		}
		System.out.println("*****�����ܳɼ�*****");
		for(int i=0;i<sum.length;i++){
			System.out.println(i+1+"���ܳɼ���"+sum[i]);
		}
	}
}