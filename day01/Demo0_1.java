import java.util.Scanner;
public class Demo0_1{
	public static void main(String[]args){
		/**
			作业：
			1.判断闰年平年
			2.判断奇数偶数
			3.三个数求最大值最小值
			要求：用三元运算符
		*/
		Scanner sc=new Scanner(System.in);
		//判断闰年平年
		System.out.println("请输入年份：");
		int year=sc.nextInt();
		String str= year%4==0&&year%100!=0||year%400==0 ? year+"是闰年" : year+"是平年";
		System.out.println(str);
		
		//判断奇数偶数
		System.out.println("输入一个整数：");
		int a=sc.nextInt();
		String str1= a%2==0 ? a+"是偶数" : a+"是奇数";
		System.out.println(str1);
		
		//三个数求最大值最小值
		System.out.println("输入三个数：");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double z=sc.nextDouble();
		double max= x>y ? x : y;
		max= max>z ? max : z;
		double min=x>y ? y:x;
		min=min<z ? min:z;
		System.out.println("最大值为"+max+"，最小值为"+min);
		
	}	
}











