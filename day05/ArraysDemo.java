import java.util.Arrays;  //�����
public class ArraysDemo{
	public static void main(String[]args){
		/**
			���ù�����Arrays�ೣ�÷�����ʾ
			��Ա����
			* public static String toString(int[] a)
			* public static void sort(int[] a)
			* public static int binarySearch(int[] a��int n)
			
			*static int[] copyOfRange(int[] original, int from, int to)  
 
		*/
		int[] arr={44,66,22,77,99,88,11,33,55};
		//����ת�����ַ���
		String str=Arrays.toString(arr);
		System.out.println(str);
		//����������
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//���ֲ��� ����n����λ�õ�����  û���򷵻ظ��Ĳ�����һ���Ը��ݸ�����������
		System.out.println(Arrays.binarySearch(arr,88));
		//��������ĳ��Χ���ݵ�������
		int[] arr1=Arrays.copyOfRange(arr,2,6);
		System.out.println(Arrays.toString(arr1));
		
	}
}