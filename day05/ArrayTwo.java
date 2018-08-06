import java.util.*;
public class ArrayTwo{
	public static void main(String[]args){
		/**
		   二维数组
		   初始化：
				1.数据类型[][] 数组名=new 数据类型[行数][列数]; //行数必须给出，列数可以不写，使用时动态给出
				2.数据类型[][] 数组名={{1,23,},{...},{...},...};
			
		*/
		//二维数组初始化
		int [][] arr1=new int[2][3];
		//赋值   不赋值有默认初始值
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		//取值
		int a=arr[0][0];
		int b=arr[0][1];
		int c=arr[0][2];
		System.out.println(a+"  "+b+"  "+c);
		
		
		//int[][] arr=new int[3][];
		//System.out.println(arr[0][0]);  //空指针异常
		
		
		/**
			练习：三个班级各有五名学生，使用二位数组求各班总成绩
		*/
		//定义一个二位数组 行代表班级  列代表班里分的每个学生的成绩
		int[][] stuArr=new int[3][5];
		Scanner sc=new Scanner(System.in);
		//通过键盘输入给学生录入成绩
		for(int i=0;i<stuArr.length;i++){
			System.out.println(i+1+"班每个学生的成绩：");
			for(int j=0;j<stuArr[i].length;j++){
				stuArr[i][j]=sc.nextInt();
			}
		}
		int[] sum=new int[3];
		for(int i=0;i<stuArr.length;i++){
			System.out.println("*****"+(i+1)+"班的学生成绩"+"*****");
			for(int j=0;j<stuArr.length;j++){
				System.out.println(i+1+"班第"+(j+1)+"名学生的成绩："+stuArr[i][j]);
				sum[i]+=stuArr[i][j];
			}
		}
		System.out.println("*****各班总成绩*****");
		for(int i=0;i<sum.length;i++){
			System.out.println(i+1+"班总成绩："+sum[i]);
		}
	}
}