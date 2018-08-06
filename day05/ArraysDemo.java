import java.util.Arrays;  //导入包
public class ArraysDemo{
	public static void main(String[]args){
		/**
			常用工具类Arrays类常用方法演示
			成员方法
			* public static String toString(int[] a)
			* public static void sort(int[] a)
			* public static int binarySearch(int[] a，int n)
			
			*static int[] copyOfRange(int[] original, int from, int to)  
 
		*/
		int[] arr={44,66,22,77,99,88,11,33,55};
		//数组转换成字符串
		String str=Arrays.toString(arr);
		System.out.println(str);
		//将数组排序
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//二分查找 返回n所在位置的索引  没有则返回负的插入点减一可以根据该数算出插入点
		System.out.println(Arrays.binarySearch(arr,88));
		//复制数组某范围内容到新数组
		int[] arr1=Arrays.copyOfRange(arr,2,6);
		System.out.println(Arrays.toString(arr1));
		
	}
}