 import java.util.*;
 public class HomeWork2{
	 public static void main(String[]args){
		 /**
			�����д�����ʽ��ڿ���̨����������ܽ��
		 */
		 double arr[]=new double[5];
		 System.out.println("�����");
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<arr.length;i++){
			 arr[i]=sc.nextDouble();
		 }
		 System.out.println("���        ���");
		 double sum=0;
		 for(int i=0;i<arr.length;i++){
			 System.out.println((i+1)+"          "+arr[i]+"��");
			 sum=sum+arr[i];
		 }
		 System.out.println("�ܶ�        "+sum+"��");
	 }
 }