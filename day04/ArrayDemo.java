import java.util.*;
public class ArrayDemo{
	public static void main(String[]args){
		/**
			数组：数组可以看做一个容器，用于储存相同的数据类型的多个值
				  数组既可以储存基本数据类型也可以存放引用数据类型
			语法：
				声明：1.数据类型[] 数组名;  2.数据类型 数组名[];
				动态初始化：动态初始化：数组名=new 数据类型[数组长度];
				建议声明的同时初始化：数据类型[] 数组名=new 数据类型[数组长度];
				静态初始化：数据类型[] 数组名=new 数据类型[]{元素1,元素2,...};
					可简化：数据类型[] 数组名={元素1,元素2,...};
		*/
		//静态初始化
		int arr1[]=new int[]{1,2,3,4,5};  //静态初始化中括号内不允许定义长度
		int[] arr2={11,22,33,44,55};   //只能在同一行进行
		
		int[] arr5=new int[0];
		System.out.println(arr5);    //长度是零 有地址值但是没有空间 
		
		//动态初始化
		String[] arr3=new String[5];   
		System.out.println(arr3);  //打印结果@15db9742 这是一个地址值  
		//动态初始化赋值
		arr3[0]="托瓦兹";
		arr3[1]="比尔盖茨";
		arr3[2]="马修斯托曼";
		arr3[3]="洛夫莱斯";
		arr3[4]="唐纳德";
		//arr3[5]="";   访问不存在的索引  ArrayIndexOutOfBoundsException:数组索引越界异常
		
		//修改数组中的值
		arr3[2]="詹姆斯高斯林";
		
		//获取数组中的值
		String str=arr3[2];
		System.out.println(arr3[2]);   
		
		//arr2=null;                     //数组引用等于空 不在指向堆内存
		//System.out.println(arr2[0]);  //NullPointerException:空指针异常  
		
		//通过键盘录入给数组中元素赋值
		Scanner sc=new Scanner(System.in);
		String[] arr4=new String[5];
		for(int i=0;i<arr4.length;i++){   //length获取数组长度
			arr4[i]=sc.next();
		}
		//数组遍历
		for(String temp:arr4){
			System.out.print(temp+"\t");
		}
	}
}