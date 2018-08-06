import java.util.*;
public class SeekDemo{
	public static void main(String[]args){
		int[] arr={00,11,22,33,44,55,66,77,88,99};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(seek(arr,n));
	}
	//���ֲ���
	public static int seek(int[] arr,int n){
		//�������������ֱ�ָ����С�������������
		int min=0,max=arr.length-1;
		//���min<max˵���Ѿ�����û���ҵ�
		while(min<=max){
			//���������������С�����ҵ��м���� 
			int mid=(min+max)/2;
			if(n==arr[mid]){    //ÿ�����м����������ҵ������бȽ�
				return mid;     //��ͬ�ͷ��ص�ǰ������
			}else if(n>arr[mid]){
				//����������м��� ��С�����Ƶ��м�����һ��λ��
				min=mid+1;
			}else {
				//�����С���м���  ��������Ƶ��м�����һ��λ��
				max=mid-1;
			}
		}
		return -1;//û���ҵ�����-1
	}
}