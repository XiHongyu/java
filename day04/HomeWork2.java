 import java.util.*;
 public class HomeWork2{
	 public static void main(String[]args){
		 /**
			数组中存入五笔金额，在控制台输出并计算总金额
		 */
		 double arr[]=new double[5];
		 System.out.println("输入金额：");
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<arr.length;i++){
			 arr[i]=sc.nextDouble();
		 }
		 System.out.println("序号        金额");
		 double sum=0;
		 for(int i=0;i<arr.length;i++){
			 System.out.println((i+1)+"          "+arr[i]+"￥");
			 sum=sum+arr[i];
		 }
		 System.out.println("总额        "+sum+"￥");
	 }
 }