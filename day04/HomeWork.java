import java.util.*;
public class HomeWork{
	public static void main(String[]args){
		/**
			有一个数组：8,4,2,1,23,344,12
			一次完成下列操作
			1.循环输出数组的值
			2.求数组中所有数值的和
			3.查找元素出现的索引位置
			4.输入一个数 判断数组中是否存在该数
		*/
		//声明一个数组 并赋值
		int[] arr={8,4,2,1,23,344,12};
		//循环输出数组中的值
		for(int temp:arr){
			System.out.print(temp+"  ");
		}
		//求和
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("所有元素的和："+sum);
		//键盘输入一个数查找元素出现的索引  如果没有提示没找到
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个数：");
		int a=sc.nextInt();
		boolean b=true;
		for(int i=0;i<arr.length;i++){
			if(a==arr[i]){
				b=false;
				System.out.println(a+"在"+i+"索引的位置");
				break;
			}
			
		}
		if(b){
				System.out.println("没有找到"+a);
		}
	}
}