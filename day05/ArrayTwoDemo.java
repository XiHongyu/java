public class ArrayTwoDemo{
	public static void main(String[]args){
		/**
			练习
			1.矩阵转换
			2.求二维数组对角线和
			3.打印杨辉三角，占用最小内存
		*/
		//1.矩阵转换
		//初始化一个二维数组arr1，三行三列
		int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
		//打印转换前
		printMat(arr1);
		//转换
		int[][] arr2=matrix(arr1);
		//打印转换后
		printMat(arr2);
		
		//2.求对角线和
		int sum=arrSum(arr1);
		System.out.println(sum);
		
		//打印杨辉三角
		printMat(yangHui(10));
		
		
	}
	//打印矩阵
	public static void printMat(int[][] arr){
		for(int[] temp:arr){
			for(int temp1:temp){
				System.out.print(temp1+"  ");
			}
			System.out.println();
		}
	}
	//矩阵转换
	public static int[][] matrix(int[][] arr){
		//初始化一个两行三列的数组来接收变换后的矩阵
		int[][] arr2=new int[3][3];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr2[j][i]=arr[i][j];
			}
		}
		return arr2;
	}
	//求对角线和
	public static int arrSum(int[][] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i==j||i+j==arr.length-1){
					sum+=arr[i][j];
				}
			}
		}
		return sum;	
	}
	
	//打印杨辉三角
	public static int[][] yangHui(int n){
		int[][] arr=new int[n][];
		for(int i=0;i<arr.length;i++){
			arr[i]=new int[i+1];
			for(int j=0;j<arr[i].length;j++){
				if(j==0||j==arr[i].length-1){
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
		}
		
		return arr;
		
	}
	
	
	
	
	
}