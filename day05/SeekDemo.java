import java.util.*;
public class SeekDemo{
	public static void main(String[]args){
		int[] arr={00,11,22,33,44,55,66,77,88,99};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(seek(arr,n));
	}
	//二分查找
	public static int seek(int[] arr,int n){
		//定义两个变量分别指向最小索引和最大索引
		int min=0,max=arr.length-1;
		//如果min<max说明已经查完没有找到
		while(min<=max){
			//根据最大索引和最小索引找到中间的数 
			int mid=(min+max)/2;
			if(n==arr[mid]){    //每次拿中间数与所查找的数进行比较
				return mid;     //形同就返回当前的索引
			}else if(n>arr[mid]){
				//查的数大于中间数 最小索引移到中间数加一的位置
				min=mid+1;
			}else {
				//查的数小于中间数  最大索引移到中间数减一的位置
				max=mid-1;
			}
		}
		return -1;//没有找到返回-1
	}
}