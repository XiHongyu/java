import java.util.*;
public class SortDemo{
	public static void main(String[]args){
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		print(arr);
		//����ð������
		//bubbling(arr);
		//����ѡ������
		select(arr);
		//���ò�������
		insert(arr);
		print(arr);
		//������ת�����ַ������
		String str=toString(arr);
		System.out.println(str);
	}
	//��������
	public static void exchange(int[] arr,int i,int j){
		int t=0;
		t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	//��ӡ����
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	/**
		ð������
		�����������бȽϣ������³�С�����ϸ�������
	*/
	public static void bubbling(int[] arr){
		//��ѭ�������ж��ִ�  ���ִε������鳤�ȼ�һ
		for(int i=0;i<arr.length-1;i++){
			//��ѭ�������жϴ���  ÿ���жϴ����������鳤�ȼ�һ�ټ��ִ���
			for(int j=0;j<arr.length-1-i;j++){
				//��ǰ�����һ�����Ƚ�  ����³�С���ϸ�������
				if(arr[j]<arr[j+1]){
					exchange(arr,j,j+1);
				}
			}
		}
	}
	/*
		ѡ������:
		����ָ��һ��������û�������ν��бȽϣ�����ȵ�ǰ��С��ָ���С�����������߱Ƚ�
		�Ƚ�������ָ�뷢���ƶ����ڳ�ʼָ���������λ��
		
	*/
	
	public static void select(int[] arr){
		//���ѭ������p�״�ָ�����
		for(int i=0;i<arr.length-1;i++){
			int p=i;     //��¼��ǰ��Сֵ��λ��
			//��ѭ�����ƱȽϴ��� ÿ��ѭ���꼴��ȷ����ǰλ�õ���
			for(int j=i+1;j<arr.length;j++){
				if(arr[p]>arr[j]){   //�����ȵ�ǰ��С��ʱ��pָ��ǰ��
					p=j;
				}
			}
			if(p!=i){   //�Ƚ���Ϻ����Pָ��λ�÷����ı�˵���е�ǰ��С��ֵ ����н���
				exchange(arr,i,p);
			}
			System.out.println(i+1+"�������");
			print(arr);
		}
	}
	/**
		��������:
		����һ���µ����� �Ȱѵ�һ�����Ž�ȥ������һ����ʱ��ǰһ�����Ƚ������ͼ�������ţ�
		���С������ǰһ�����Ƚ�  �Ƚϵ�����λ�ý������
	*/
	public static void insert(int[] arr){
		//���ѭ������������������һ����ֱ�ӷ��� ��������һ��
		for(int i=0;i<arr.length-1;i++){
			//�ڴ�ѭ�����ƱȽϴ��� ��ǰ��������֮ǰ�������Ƚ�
			for(int j=i+1;j>0;j--){
				if(arr[j]<arr[j-1]){ //����������������ͽ���λ��
					exchange(arr,j,j-1);
				}else {
					break;
				}
			}
		}
		
	}
	//������ת�����ַ���
	public static String toString(int[] arr){
		StringBuffer sb=new StringBuffer();
		if(arr==null){
			sb.append("null");
		}else if(arr.length==0){
			sb.append("[]");
		}else{
			sb.append("[");
			for(int i=0;i<arr.length;i++){
				if(i!=arr.length-1){
					sb.append(arr[i]+", ");
				}else {
					sb.append(arr[i]+"]");
				}
			}
		}
		return sb.toString();
	}
	
	
	
	
	
}