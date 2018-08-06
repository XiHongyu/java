import java.util.*;
public class SortDemo{
	public static void main(String[]args){
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		print(arr);
		//调用冒泡排序
		//bubbling(arr);
		//调用选择排序
		select(arr);
		//调用插入排序
		insert(arr);
		print(arr);
		//将数组转换成字符串输出
		String str=toString(arr);
		System.out.println(str);
	}
	//两数交换
	public static void exchange(int[] arr,int i,int j){
		int t=0;
		t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	//打印数组
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	/**
		冒泡排序：
		相邻两数进行比较，大数下沉小数向上浮（升序）
	*/
	public static void bubbling(int[] arr){
		//外循环控制判断轮次  总轮次等于数组长度减一
		for(int i=0;i<arr.length-1;i++){
			//内循环控制判断次数  每轮判断次数等于数组长度减一再减轮次数
			for(int j=0;j<arr.length-1-i;j++){
				//当前数与后一个数比较  大的下沉小的上浮（升序）
				if(arr[j]<arr[j+1]){
					exchange(arr,j,j+1);
				}
			}
		}
	}
	/*
		选择排序:
		依次指定一个数与后边没个数依次进行比较，如果比当前数小则指向更小的数继续与后边比较
		比较完毕如果指针发生移动则于初始指向的数交换位置
		
	*/
	
	public static void select(int[] arr){
		//外层循环控制p首次指向的数
		for(int i=0;i<arr.length-1;i++){
			int p=i;     //记录当前最小值的位置
			//内循环控制比较次数 每次循环完即可确定当前位置的数
			for(int j=i+1;j<arr.length;j++){
				if(arr[p]>arr[j]){   //遇到比当前数小的时候将p指向当前数
					p=j;
				}
			}
			if(p!=i){   //比较完毕后如果P指向位置发生改变说明有当前数小的值 需进行交换
				exchange(arr,i,p);
			}
			System.out.println(i+1+"次排序后：");
			print(arr);
		}
	}
	/**
		插入排序:
		想象一个新的数组 先把第一个数放进去，放下一个数时与前一个数比较如果大就继续往后放，
		如果小继续向前一个数比较  比较到合适位置将其插入
	*/
	public static void insert(int[] arr){
		//外层循环控制拿数次数，第一个数直接放入 可以少拿一次
		for(int i=0;i<arr.length-1;i++){
			//内次循环控制比较次数 当前插入数与之前所有数比较
			for(int j=i+1;j>0;j--){
				if(arr[j]<arr[j-1]){ //如果遇到比起大的数就交换位置
					exchange(arr,j,j-1);
				}else {
					break;
				}
			}
		}
		
	}
	//将数组转换成字符串
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